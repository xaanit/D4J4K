package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.TextChannel
import discord4j.core.`object`.entity.User
import discord4j.core.`object`.entity.Webhook
import discord4j.core.spec.WebhookEditSpec
import me.xaanit.d4j4k.await
import me.xaanit.d4j4k.grab
import me.xaanit.d4j4k.unit

suspend fun Webhook.guild(): Guild = guild.await()
suspend fun Webhook.channel(): TextChannel = channel.await()
suspend fun Webhook.creator(): User = creator.await()
fun Webhook.name(): String? = name.grab()
fun Webhook.avatar(): String? = avatar.grab()
suspend fun Webhook.awaitDelete(): Unit = delete().unit()
suspend fun Webhook.update(spec: (WebhookEditSpec) -> Unit): Webhook = edit(spec).await()