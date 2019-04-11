package me.xaanit.d4j4k.event.domain.message

import discord4j.core.`object`.entity.Guild;
import discord4j.core.`object`.entity.Message;
import discord4j.core.`object`.entity.MessageChannel;
import discord4j.core.`object`.util.Snowflake;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.message.ReactionRemoveAllEvent


suspend fun ReactionRemoveAllEvent.channel(): MessageChannel = channel.awaitSingle()
suspend fun ReactionRemoveAllEvent.message(): Message = message.awaitSingle()
fun ReactionRemoveAllEvent.guildId(): Snowflake? = guildId.orElse(null)
suspend fun ReactionRemoveAllEvent.guild(): Guild = guild.awaitSingle()
                