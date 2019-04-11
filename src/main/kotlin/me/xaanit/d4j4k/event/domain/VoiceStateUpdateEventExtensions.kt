package me.xaanit.d4j4k.event.domain

import discord4j.core.`object`.VoiceState;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.VoiceStateUpdateEvent


fun VoiceStateUpdateEvent.old(): VoiceState? = old.orElse(null)
                