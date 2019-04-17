package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.entity.TextChannel
import discord4j.core.`object`.entity.Webhook
import discord4j.core.`object`.util.Snowflake
import discord4j.core.spec.TextChannelEditSpec
import discord4j.core.spec.WebhookCreateSpec
import me.xaanit.d4j4k.await
import reactor.core.publisher.Flux

suspend fun TextChannel.update(spec: (TextChannelEditSpec) -> Unit): TextChannel = edit(spec).await()
suspend fun TextChannel.awaitBulkDelete(messages: List<Snowflake>): List<Snowflake> =
    bulkDelete(Flux.fromIterable(messages)).await()

suspend fun TextChannel.newWebhook(spec: (WebhookCreateSpec) -> Unit): Webhook = createWebhook(spec).await()
suspend fun TextChannel.webhooks(): List<Webhook> = webhooks.await()