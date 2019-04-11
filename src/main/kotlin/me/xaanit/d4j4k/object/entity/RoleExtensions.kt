package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.Role
import kotlinx.coroutines.reactive.awaitSingle


suspend fun Role.position(): Int = position.awaitSingle()
suspend fun Role.guild(): Guild = guild.awaitSingle()
suspend fun Role.eradicate(): Unit = delete().awaitSingle().let {}
                