package me.xaanit.d4j4k.event.domain.channel

import discord4j.core.`object`.entity.MessageChannel
import discord4j.core.event.domain.channel.PinsUpdateEvent
import me.xaanit.d4j4k.await
import me.xaanit.d4j4k.grab
import java.time.Instant


suspend fun PinsUpdateEvent.channel(): MessageChannel = channel.await()
fun PinsUpdateEvent.lastPinTimestamp(): Instant? = lastPinTimestamp.grab()
                