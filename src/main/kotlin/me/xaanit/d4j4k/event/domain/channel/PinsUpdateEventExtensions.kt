package me.xaanit.d4j4k.event.domain.channel

import discord4j.core.`object`.entity.MessageChannel;
import java.time.Instant;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.channel.PinsUpdateEvent


suspend fun PinsUpdateEvent.channel(): MessageChannel = channel.awaitSingle()
fun PinsUpdateEvent.lastPinTimestamp(): Instant? = lastPinTimestamp.orElse(null)
                