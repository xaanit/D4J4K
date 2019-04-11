package me.xaanit.d4j4k.event.domain.guild

import discord4j.core.`object`.entity.Guild;
import discord4j.core.`object`.entity.GuildEmoji;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.guild.EmojisUpdateEvent


suspend fun EmojisUpdateEvent.guild(): Guild = guild.awaitSingle()
                