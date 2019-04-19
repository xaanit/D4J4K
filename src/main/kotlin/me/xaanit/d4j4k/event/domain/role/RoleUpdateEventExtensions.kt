package me.xaanit.d4j4k.event.domain.role

import discord4j.core.`object`.entity.Role
import discord4j.core.event.domain.role.RoleUpdateEvent
import me.xaanit.d4j4k.grab


fun RoleUpdateEvent.old(): Role? = old.grab()
                