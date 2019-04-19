package me.xaanit.d4j4k.event.domain.guild

import discord4j.core.`object`.entity.Guild
import discord4j.core.event.domain.guild.UnbanEvent
import me.xaanit.d4j4k.await


suspend fun UnbanEvent.guild(): Guild = guild.await()
                