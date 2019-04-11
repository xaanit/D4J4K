package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.ExtendedInvite
import discord4j.core.`object`.entity.*
import discord4j.core.`object`.util.Snowflake
import kotlinx.coroutines.reactive.awaitSingle
import java.time.Instant


suspend fun TextChannel.guild(): Guild = guild.awaitSingle()
suspend fun TextChannel.position(): Int = position.awaitSingle()
fun TextChannel.lastMessageId(): Snowflake? = lastMessageId.orElse(null)
suspend fun TextChannel.lastMessage(): Message = lastMessage.awaitSingle()
fun TextChannel.lastPinTimestamp(): Instant? = lastPinTimestamp.orElse(null)
suspend fun TextChannel.pinnedMessages(): List<Message> = pinnedMessages.collectList().awaitSingle()
fun TextChannel.categoryId(): Snowflake? = categoryId.orElse(null)
suspend fun TextChannel.category(): Category = category.awaitSingle()
suspend fun TextChannel.invites(): List<ExtendedInvite> = invites.collectList().awaitSingle()
fun TextChannel.topic(): String? = topic.orElse(null)
suspend fun TextChannel.webhooks(): List<Webhook> = webhooks.collectList().awaitSingle()
                