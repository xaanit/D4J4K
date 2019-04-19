package me.xaanit.d4j4k.event.domain.message

import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.MessageChannel
import discord4j.core.event.domain.message.MessageBulkDeleteEvent
import me.xaanit.d4j4k.await


suspend fun MessageBulkDeleteEvent.channel(): MessageChannel = channel.await()
suspend fun MessageBulkDeleteEvent.guild(): Guild = guild.await()
                