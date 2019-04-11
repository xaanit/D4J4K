package me.xaanit

import java.io.File
import java.util.*

object Generate {
    @JvmStatic
    fun main(args: Array<String>) {

        walkThrough(
            directory = File("C:\\Users\\shado\\Desktop\\extensions"),
            `do` = {
                if (!it.isDirectory) it.delete()
            },
            filter = { true }
        )

        val scanner = Scanner(System.`in`)
        println("Ready to contijnue??")
        val n = scanner.nextLine()
        if (n == "no") System.exit(0)
        val packageR = "package ([^;]+);".toRegex()
        val mono = "public Mono<([^>]+)> ([^(]+)\\(\\) \\{".toRegex()
        val flux = "public Flux<([^>]+)> ([^(]+)\\(\\) \\{".toRegex()
        val optional = "public Optional<([^>]+)> ([^(]+)\\(\\) \\{".toRegex()


        val dir = File("C:\\Users\\shado\\Desktop\\core")
        walkThrough(
            directory = dir,
            `do` = { file ->
                val lines = file.readLines()
                val methods = mutableListOf<String>()
                val `package` = packageR.find(lines.filter { it.startsWith("package") }[0])!!.groups[1]!!.value
                val returnTypes = mutableSetOf<String>()
                lines.forEach {

                    val mg = mono.find(it)?.groups
                    if (mg != null) {
                        val monoType = mg[1]!!.value
                        returnTypes.add(monoType)
                        val monoName = lowercase(mg[2]!!.value)
                        if (monoType == "Void")
                            methods.add("suspend fun ${file.nameWithoutExtension}.$monoName(): Unit = $monoName.awaitSingle().let{}")
                        else
                            methods.add("suspend fun ${file.nameWithoutExtension}.$monoName(): $monoType = $monoName.awaitSingle()")
                    }

                    val fg = flux.find(it)?.groups
                    if (fg != null) {
                        val monoType = fg[1]!!.value
                        returnTypes.add(monoType)
                        val monoName = lowercase(fg[2]!!.value)
                        methods.add("suspend fun ${file.nameWithoutExtension}.$monoName(): List<$monoType> = $monoName.collectList().awaitSingle()")
                    }

                    val og = optional.find(it)?.groups
                    if (og != null) {
                        val monoType = og[1]!!.value
                        returnTypes.add(monoType)
                        val monoName = lowercase(og[2]!!.value)
                        methods.add("fun ${file.nameWithoutExtension}.$monoName(): $monoType? = $monoName.orElse(null)")
                    }

                }

                if (!methods.isEmpty()) {
                    val imports = lines.filter { it.startsWith("import") }
                        .filter {
                            var bool = false
                            returnTypes.forEach { rt ->
                                if (it.contains(rt)) bool = true
                            }
                            bool
                        }.map {
                            it.replace("object", "`object`")
                        }
                    try {
                        val new = File(
                            file.path.replace("core", "extensions").replace(
                                "java",
                                "kt"
                            ).replace(file.nameWithoutExtension, "${file.nameWithoutExtension}Extensions")
                        )
                        if (!new.exists()) new.createNewFile()
                        new.writeText(
                            text = "package ${`package`.replace(
                                "discord4j.core",
                                "me.xaanit.d4j4k"
                            )}\n\n${imports.make()}\nimport kotlinx.coroutines.reactive.awaitSingle\nimport $`package`.${file.nameWithoutExtension}\n\n\n${methods.make()}                "
                        )
                    } catch (e: Exception) {
                    }
                }
            })
    }

    fun walkThrough(directory: File, `do`: (File) -> Unit, filter: (File) -> Boolean = { it.extension == "java" }) {
        directory.listFiles().forEach {
            if (it.isDirectory) walkThrough(it, `do`)
            else if (filter(it)) `do`(it)
        }
    }


    fun lowercase(s: String): String {
        if (s.startsWith("get")) return lowercase(s.substring(3))
        return s[0].toLowerCase() + s.substring(1)
    }

    fun List<String>.make(): String {
        val builder = StringBuilder()
        forEach {
            builder.append(it).append('\n')
        }
        return builder.toString()
    }

}