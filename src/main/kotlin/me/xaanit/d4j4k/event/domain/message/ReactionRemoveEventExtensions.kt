package me.xaanit.d4j4k.event.domain.message

import discord4j.core.`object`.entity.Guild;
import discord4j.core.`object`.entity.Message;
import discord4j.core.`object`.entity.MessageChannel;
import discord4j.core.`object`.entity.User;
import discord4j.core.`object`.util.Snowflake;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.message.ReactionRemoveEvent


suspend fun ReactionRemoveEvent.user(): User = user.awaitSingle()
suspend fun ReactionRemoveEvent.channel(): MessageChannel = channel.awaitSingle()
suspend fun ReactionRemoveEvent.message(): Message = message.awaitSingle()
fun ReactionRemoveEvent.guildId(): Snowflake? = guildId.orElse(null)
suspend fun ReactionRemoveEvent.guild(): Guild = guild.awaitSingle()
                