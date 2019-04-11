package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.ExtendedInvite
import discord4j.core.`object`.VoiceState
import discord4j.core.`object`.entity.Category
import discord4j.core.`object`.entity.VoiceChannel
import discord4j.core.`object`.util.Snowflake
import kotlinx.coroutines.reactive.awaitSingle


fun VoiceChannel.categoryId(): Snowflake? = categoryId.orElse(null)
suspend fun VoiceChannel.category(): Category = category.awaitSingle()
suspend fun VoiceChannel.invites(): List<ExtendedInvite> = invites.collectList().awaitSingle()
suspend fun VoiceChannel.voiceStates(): List<VoiceState> = voiceStates.collectList().awaitSingle()
                