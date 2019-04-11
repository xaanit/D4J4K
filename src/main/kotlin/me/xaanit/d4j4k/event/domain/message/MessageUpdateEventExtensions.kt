package me.xaanit.d4j4k.event.domain.message

import discord4j.core.`object`.entity.Guild;
import discord4j.core.`object`.entity.Message;
import discord4j.core.`object`.entity.MessageChannel;
import discord4j.core.`object`.util.Snowflake;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.message.MessageUpdateEvent


suspend fun MessageUpdateEvent.message(): Message = message.awaitSingle()
suspend fun MessageUpdateEvent.channel(): MessageChannel = channel.awaitSingle()
fun MessageUpdateEvent.guildId(): Snowflake? = guildId.orElse(null)
suspend fun MessageUpdateEvent.guild(): Guild = guild.awaitSingle()
fun MessageUpdateEvent.old(): Message? = old.orElse(null)
fun MessageUpdateEvent.currentContent(): String? = currentContent.orElse(null)
                