package me.xaanit.d4j4k.`object`

import discord4j.core.`object`.VoiceState
import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.User
import discord4j.core.`object`.entity.VoiceChannel
import discord4j.core.`object`.util.Snowflake
import kotlinx.coroutines.reactive.awaitSingle

suspend fun VoiceState.guild(): Guild = guild.awaitSingle()
fun VoiceState.channelId(): Snowflake? = channelId.orElse(null)
suspend fun VoiceState.channel(): VoiceChannel = channel.awaitSingle()
suspend fun VoiceState.user(): User = user.awaitSingle()
                
