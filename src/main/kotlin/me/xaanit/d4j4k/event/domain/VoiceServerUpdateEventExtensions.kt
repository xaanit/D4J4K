package me.xaanit.d4j4k.event.domain

import discord4j.core.`object`.entity.Guild;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.VoiceServerUpdateEvent


suspend fun VoiceServerUpdateEvent.guild(): Guild = guild.awaitSingle()
                