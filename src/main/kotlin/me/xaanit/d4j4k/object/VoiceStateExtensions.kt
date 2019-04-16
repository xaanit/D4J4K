package me.xaanit.d4j4k.`object`

import discord4j.core.`object`.VoiceState
import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.User
import discord4j.core.`object`.entity.VoiceChannel
import discord4j.core.`object`.util.Snowflake
import me.xaanit.d4j4k.await
import me.xaanit.d4j4k.grab

/**
 * Requests to retrieve the guild associated with this voice state.
 *
 * @return A suspended call to the [reactor.core.publisher.Mono] where, upon successful competition, returns
 * the [Guild] this voice state is in. If an error is received it's thrown.
 */
suspend fun VoiceState.guild(): Guild = guild.await()

/**
 * Requests the channel ID associated with the voice state.
 *
 * @reutrn The nullable [Snowflake] for the channel.
 */
fun VoiceState.channelId(): Snowflake? = channelId.grab()

/**
 * Requests to retrieve the voice channel associated with this voice state.
 *
 * @return A suspended call to the [reactor.core.publisher.Mono] where, upon successful competition, returns
 * the [VoiceChannel] this voice state is for. If an error is received it's thrown.
 */
suspend fun VoiceState.channel(): VoiceChannel = channel.await()

/**
 * Requests to retrieve the user associated with this voice state.
 *
 * @return A suspended call to the [reactor.core.publisher.Mono] where, upon successful competition, returns
 * the [User] this voice state is for. If an error is received it's thrown.
 */
suspend fun VoiceState.user(): User = user.await()

