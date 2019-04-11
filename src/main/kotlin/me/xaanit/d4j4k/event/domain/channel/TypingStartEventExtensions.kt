package me.xaanit.d4j4k.event.domain.channel

import discord4j.core.`object`.entity.MessageChannel;
import discord4j.core.`object`.entity.User;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.channel.TypingStartEvent


suspend fun TypingStartEvent.channel(): MessageChannel = channel.awaitSingle()
suspend fun TypingStartEvent.user(): User = user.awaitSingle()
                