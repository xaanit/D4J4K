package me.xaanit.d4j4k.event.domain.message

import discord4j.core.`object`.entity.Guild;
import discord4j.core.`object`.entity.MessageChannel;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.message.MessageBulkDeleteEvent


suspend fun MessageBulkDeleteEvent.channel(): MessageChannel = channel.awaitSingle()
suspend fun MessageBulkDeleteEvent.guild(): Guild = guild.awaitSingle()
                