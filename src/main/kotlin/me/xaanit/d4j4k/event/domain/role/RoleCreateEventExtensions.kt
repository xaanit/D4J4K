package me.xaanit.d4j4k.event.domain.role

import discord4j.core.`object`.entity.Guild;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.role.RoleCreateEvent


suspend fun RoleCreateEvent.guild(): Guild = guild.awaitSingle()
                