package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.GuildEmoji
import discord4j.core.`object`.entity.Role
import discord4j.core.`object`.entity.User
import kotlinx.coroutines.reactive.awaitSingle


suspend fun GuildEmoji.roles(): List<Role> = roles.collectList().awaitSingle()
suspend fun GuildEmoji.user(): User = user.awaitSingle()
suspend fun GuildEmoji.guild(): Guild = guild.awaitSingle()
suspend fun GuildEmoji.deleteEmoji(): Unit = delete().awaitSingle().let {}
                