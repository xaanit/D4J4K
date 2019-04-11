package me.xaanit.d4j4k.object.entity


import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.object.entity.Role


suspend fun Role.position(): Integer = position.awaitSingle()
suspend fun Role.guild(): Guild = guild.awaitSingle()
suspend fun Role.delete(): Unit = delete.awaitSingle().let{}
                