package me.xaanit.d4j4k.event.domain.message

import discord4j.core.`object`.entity.Message;
import discord4j.core.`object`.entity.MessageChannel;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.message.MessageDeleteEvent


fun MessageDeleteEvent.message(): Message? = message.orElse(null)
suspend fun MessageDeleteEvent.channel(): MessageChannel = channel.awaitSingle()
                