package me.xaanit.d4j4k.event.domain;

import discord4j.core.`object`.entity.User
import discord4j.core.event.domain.UserUpdateEvent
import me.xaanit.d4j4k.grab


fun UserUpdateEvent.old(): User? = old.grab()
                