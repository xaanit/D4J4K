package me.xaanit.d4j4k.event.domain.message

import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.Message
import discord4j.core.`object`.entity.MessageChannel
import discord4j.core.`object`.entity.User
import discord4j.core.`object`.util.Snowflake
import discord4j.core.event.domain.message.ReactionRemoveEvent
import me.xaanit.d4j4k.await
import me.xaanit.d4j4k.grab


suspend fun ReactionRemoveEvent.user(): User = user.await()
suspend fun ReactionRemoveEvent.channel(): MessageChannel = channel.await()
suspend fun ReactionRemoveEvent.message(): Message = message.await()
fun ReactionRemoveEvent.guildId(): Snowflake? = guildId.grab()
suspend fun ReactionRemoveEvent.guild(): Guild = guild.await()
                