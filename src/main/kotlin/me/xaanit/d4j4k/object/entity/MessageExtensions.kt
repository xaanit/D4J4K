package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.entity.*
import discord4j.core.`object`.util.Snowflake
import kotlinx.coroutines.reactive.awaitSingle
import java.time.Instant


suspend fun Message.channel(): MessageChannel = channel.awaitSingle()
fun Message.webhookId(): Snowflake? = webhookId.orElse(null)
fun Message.author(): User? = author.orElse(null)
suspend fun Message.authorAsMember(): Member = authorAsMember.awaitSingle()
fun Message.content(): String? = content.orElse(null)
fun Message.editedTimestamp(): Instant? = editedTimestamp.orElse(null)
suspend fun Message.userMentions(): List<User> = userMentions.collectList().awaitSingle()
suspend fun Message.roleMentions(): List<Role> = roleMentions.collectList().awaitSingle()
suspend fun Message.webhook(): Webhook = webhook.awaitSingle()
suspend fun Message.guild(): Guild = guild.awaitSingle()
suspend fun Message.eradicate(): Unit = delete().awaitSingle().let {}
suspend fun Message.deleteAllReactions(): Unit = removeAllReactions().awaitSingle().let {}
suspend fun Message.pinMessage(): Unit = pin().awaitSingle().let {}
suspend fun Message.unpinMessage(): Unit = unpin().awaitSingle().let {}
                