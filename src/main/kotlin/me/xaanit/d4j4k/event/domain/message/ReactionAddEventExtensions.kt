package me.xaanit.d4j4k.event.domain.message

import discord4j.core.`object`.entity.Guild;
import discord4j.core.`object`.entity.Message;
import discord4j.core.`object`.entity.MessageChannel;
import discord4j.core.`object`.entity.User;
import discord4j.core.`object`.util.Snowflake;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.message.ReactionAddEvent


suspend fun ReactionAddEvent.user(): User = user.awaitSingle()
suspend fun ReactionAddEvent.channel(): MessageChannel = channel.awaitSingle()
suspend fun ReactionAddEvent.message(): Message = message.awaitSingle()
fun ReactionAddEvent.guildId(): Snowflake? = guildId.orElse(null)
suspend fun ReactionAddEvent.guild(): Guild = guild.awaitSingle()
                