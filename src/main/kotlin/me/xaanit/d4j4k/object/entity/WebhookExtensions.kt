package me.xaanit.d4j4k.`object`.entity


import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.TextChannel
import discord4j.core.`object`.entity.User
import discord4j.core.`object`.entity.Webhook
import kotlinx.coroutines.reactive.awaitSingle


suspend fun Webhook.guild(): Guild = guild.awaitSingle()
suspend fun Webhook.channel(): TextChannel = channel.awaitSingle()
suspend fun Webhook.creator(): User = creator.awaitSingle()
fun Webhook.name(): String? = name.orElse(null)
fun Webhook.avatar(): String? = avatar.orElse(null)
suspend fun Webhook.erdaicate(): Unit = delete().awaitSingle().let {}
                