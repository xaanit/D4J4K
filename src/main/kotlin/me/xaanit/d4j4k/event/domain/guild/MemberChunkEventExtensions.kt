package me.xaanit.d4j4k.event.domain.guild

import discord4j.core.`object`.entity.Guild;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.guild.MemberChunkEvent


suspend fun MemberChunkEvent.guild(): Guild = guild.awaitSingle()
                