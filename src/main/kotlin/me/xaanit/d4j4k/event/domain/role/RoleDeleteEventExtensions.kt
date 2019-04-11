package me.xaanit.d4j4k.event.domain.role

import discord4j.core.`object`.entity.Guild;
import discord4j.core.`object`.entity.Role;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.role.RoleDeleteEvent


suspend fun RoleDeleteEvent.guild(): Guild = guild.awaitSingle()
fun RoleDeleteEvent.role(): Role? = role.orElse(null)
                