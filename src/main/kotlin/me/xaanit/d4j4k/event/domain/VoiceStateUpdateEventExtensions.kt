package me.xaanit.d4j4k.event.domain;

import discord4j.core.`object`.VoiceState
import discord4j.core.event.domain.VoiceStateUpdateEvent
import me.xaanit.d4j4k.grab


fun VoiceStateUpdateEvent.old(): VoiceState? = old.grab()
                