package me.xaanit.d4j4k

import discord4j.core.DiscordClient
import discord4j.core.`object`.Region
import discord4j.core.`object`.entity.ApplicationInfo
import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.User
import discord4j.core.`object`.util.Snowflake
import kotlinx.coroutines.reactive.awaitSingle


suspend fun DiscordClient.applicationInfo(): ApplicationInfo = applicationInfo.awaitSingle()
suspend fun DiscordClient.guilds(): List<Guild> = guilds.collectList().awaitSingle()
suspend fun DiscordClient.users(): List<User> = users.collectList().awaitSingle()
suspend fun DiscordClient.regions(): List<Region> = regions.collectList().awaitSingle()
suspend fun DiscordClient.self(): User = self.awaitSingle()
fun DiscordClient.selfId(): Snowflake? = selfId.orElse(null)
suspend fun DiscordClient.connect(): Unit = login().awaitSingle().let {}
suspend fun DiscordClient.disconnect(): Unit = logout().awaitSingle().let {}
                