package me.xaanit.d4j4k.event.domain.guild

import discord4j.core.`object`.entity.Guild;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.guild.BanEvent


suspend fun BanEvent.guild(): Guild = guild.awaitSingle()
                