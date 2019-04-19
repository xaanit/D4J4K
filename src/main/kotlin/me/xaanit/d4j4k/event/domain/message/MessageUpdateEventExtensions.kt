package me.xaanit.d4j4k.event.domain.message

import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.Message
import discord4j.core.`object`.entity.MessageChannel
import discord4j.core.`object`.util.Snowflake
import discord4j.core.event.domain.message.MessageUpdateEvent
import me.xaanit.d4j4k.await
import me.xaanit.d4j4k.grab


suspend fun MessageUpdateEvent.message(): Message = message.await()
suspend fun MessageUpdateEvent.channel(): MessageChannel = channel.await()
fun MessageUpdateEvent.guildId(): Snowflake? = guildId.grab()
suspend fun MessageUpdateEvent.guild(): Guild = guild.await()
fun MessageUpdateEvent.old(): Message? = old.grab()
fun MessageUpdateEvent.currentContent(): String? = currentContent.grab()
                