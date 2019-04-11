package me.xaanit.d4j4k.object.entity

import discord4j.core.`object`.ExtendedInvite;
import discord4j.core.`object`.data.ExtendedInviteBean;
import discord4j.core.`object`.data.WebhookBean;
import discord4j.core.`object`.util.Snowflake;
import discord4j.core.spec.MessageCreateSpec;
import discord4j.core.spec.WebhookCreateSpec;
import java.time.Instant;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.object.entity.TextChannel


suspend fun TextChannel.guild(): Guild = guild.awaitSingle()
suspend fun TextChannel.position(): Integer = position.awaitSingle()
fun TextChannel.lastMessageId(): Snowflake? = lastMessageId.orElse(null)
suspend fun TextChannel.lastMessage(): Message = lastMessage.awaitSingle()
fun TextChannel.lastPinTimestamp(): Instant? = lastPinTimestamp.orElse(null)
suspend fun TextChannel.type(): Unit = type.awaitSingle().let{}
suspend fun TextChannel.pinnedMessages(): List<Message> = pinnedMessages.collectList().awaitSingle()
fun TextChannel.categoryId(): Snowflake? = categoryId.orElse(null)
suspend fun TextChannel.category(): Category = category.awaitSingle()
suspend fun TextChannel.invites(): List<ExtendedInvite> = invites.collectList().awaitSingle()
fun TextChannel.topic(): String? = topic.orElse(null)
suspend fun TextChannel.webhooks(): List<Webhook> = webhooks.collectList().awaitSingle()
                