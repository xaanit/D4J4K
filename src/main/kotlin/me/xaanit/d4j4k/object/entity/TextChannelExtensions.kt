package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.entity.TextChannel
import discord4j.core.`object`.entity.Webhook
import discord4j.core.`object`.util.Snowflake
import discord4j.core.spec.TextChannelEditSpec
import discord4j.core.spec.WebhookCreateSpec
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.reactor.asFlux
import me.xaanit.d4j4k.await

suspend fun TextChannel.update(spec: (TextChannelEditSpec) -> Unit): TextChannel = edit(spec).await()
suspend fun TextChannel.awaitBulkDelete(messages: ReceiveChannel<Snowflake>): List<Snowflake> =
    bulkDelete(messages.asFlux()).await()

suspend fun TextChannel.newWebhook(spec: (WebhookCreateSpec) -> Unit): Webhook = createWebhook(spec).await()
suspend fun TextChannel.webhooks(): List<Webhook> = webhooks.await()