package me.xaanit.d4j4k.event.domain.message

import discord4j.core.`object`.entity.Message
import discord4j.core.`object`.entity.MessageChannel
import discord4j.core.event.domain.message.MessageDeleteEvent
import me.xaanit.d4j4k.await
import me.xaanit.d4j4k.grab


fun MessageDeleteEvent.message(): Message? = message.grab()
suspend fun MessageDeleteEvent.channel(): MessageChannel = channel.await()
                