package me.xaanit.d4j4k.event.domain.role

import discord4j.core.`object`.entity.Guild
import discord4j.core.event.domain.role.RoleCreateEvent
import me.xaanit.d4j4k.await


suspend fun RoleCreateEvent.guild(): Guild = guild.await()
                