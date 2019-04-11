package me.xaanit.d4j4k.event.domain.role

import discord4j.core.`object`.entity.Role;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.role.RoleUpdateEvent


fun RoleUpdateEvent.old(): Role? = old.orElse(null)
                