package me.xaanit.d4j4k.event.domain.channel

import discord4j.core.`object`.entity.VoiceChannel
import discord4j.core.event.domain.channel.VoiceChannelUpdateEvent
import me.xaanit.d4j4k.grab


fun VoiceChannelUpdateEvent.old(): VoiceChannel? = old.grab()
                