package me.xaanit.d4j4k.event.domain.guild

import discord4j.core.`object`.entity.Guild
import discord4j.core.event.domain.guild.MemberJoinEvent
import me.xaanit.d4j4k.await


suspend fun MemberJoinEvent.guild(): Guild = guild.await()
                