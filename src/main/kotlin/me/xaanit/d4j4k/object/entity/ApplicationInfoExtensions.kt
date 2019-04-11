package me.xaanit.d4j4k.`object`.entity


import discord4j.core.`object`.entity.ApplicationInfo
import discord4j.core.`object`.entity.User
import kotlinx.coroutines.reactive.awaitSingle


fun ApplicationInfo.description(): String? = description.orElse(null)
suspend fun ApplicationInfo.owner(): User = owner.awaitSingle()
                