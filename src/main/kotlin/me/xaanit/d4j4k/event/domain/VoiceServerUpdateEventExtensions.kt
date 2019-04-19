package me.xaanit.d4j4k.event.domain;

import discord4j.core.`object`.entity.Guild
import discord4j.core.event.domain.VoiceServerUpdateEvent
import me.xaanit.d4j4k.await


suspend fun VoiceServerUpdateEvent.guild(): Guild = guild.await()
                