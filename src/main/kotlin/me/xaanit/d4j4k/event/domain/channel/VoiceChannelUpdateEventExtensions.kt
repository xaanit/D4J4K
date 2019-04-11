package me.xaanit.d4j4k.event.domain.channel

import discord4j.core.`object`.entity.VoiceChannel;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.channel.VoiceChannelUpdateEvent


fun VoiceChannelUpdateEvent.old(): VoiceChannel? = old.orElse(null)
                