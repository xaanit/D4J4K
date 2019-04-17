package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.VoiceState
import discord4j.core.`object`.entity.VoiceChannel
import discord4j.core.spec.VoiceChannelEditSpec
import discord4j.core.spec.VoiceChannelJoinSpec
import discord4j.voice.VoiceConnection
import me.xaanit.d4j4k.await

suspend fun VoiceChannel.update(spec: (VoiceChannelEditSpec) -> Unit): VoiceChannel = edit(spec).await()
suspend fun VoiceChannel.voiceStates(): List<VoiceState> = voiceStates.await()
suspend fun VoiceChannel.awaitJoin(spec: (VoiceChannelJoinSpec) -> Unit): VoiceConnection = join(spec).await()