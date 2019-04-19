package me.xaanit.d4j4k.event.domain.role

import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.Role
import discord4j.core.event.domain.role.RoleDeleteEvent
import me.xaanit.d4j4k.await
import me.xaanit.d4j4k.grab


suspend fun RoleDeleteEvent.guild(): Guild = guild.await()
fun RoleDeleteEvent.role(): Role? = role.grab()
                