package me.xaanit.d4j4k.object.entity


import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.object.entity.Webhook


suspend fun Webhook.guild(): Guild = guild.awaitSingle()
suspend fun Webhook.channel(): TextChannel = channel.awaitSingle()
suspend fun Webhook.creator(): User = creator.awaitSingle()
fun Webhook.name(): String? = name.orElse(null)
fun Webhook.avatar(): String? = avatar.orElse(null)
suspend fun Webhook.delete(): Unit = delete.awaitSingle().let{}
                