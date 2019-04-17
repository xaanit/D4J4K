package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.entity.Message
import discord4j.core.`object`.entity.MessageChannel
import discord4j.core.`object`.util.Snowflake
import discord4j.core.spec.EmbedCreateSpec
import discord4j.core.spec.MessageCreateSpec
import kotlinx.coroutines.channels.ReceiveChannel
import me.xaanit.d4j4k.*
import reactor.core.publisher.Mono
import java.time.Instant

fun MessageChannel.lastMessageId(): Snowflake? = lastMessageId.grab()
suspend fun MessageChannel.lastMessage(): Message? = lastMessage.awaitNull()
fun MessageChannel.lastPinTimestamp(): Instant? = lastPinTimestamp.grab()
suspend fun MessageChannel.newMessage(spec: (MessageCreateSpec) -> Unit): Message = createMessage(spec).await()
suspend fun MessageChannel.newMessage(message: String): Message = newMessage { it.setContent(message) }
suspend fun MessageChannel.newEmbed(spec: (EmbedCreateSpec) -> Unit): Message = newMessage { it.setEmbed(spec) }
suspend fun MessageChannel.awaitType(): Unit = type().unit()
fun MessageChannel.awaitTypeUntil(pred: () -> Boolean): ReceiveChannel<Long> =
    typeUntil(Mono.just(pred())).infinite() // TODO: FIX

suspend fun MessageChannel.awaitMessagesBefore(id: Snowflake): List<Message> = getMessagesBefore(id).await()
suspend fun MessageChannel.awaitMessagesAfter(id: Snowflake): List<Message> = getMessagesAfter(id).await()
suspend fun MessageChannel.awaitMessage(id: Snowflake): Message? = getMessageById(id).awaitNull()
suspend fun MessageChannel.pinnedMessages(): List<Message> = pinnedMessages.await()