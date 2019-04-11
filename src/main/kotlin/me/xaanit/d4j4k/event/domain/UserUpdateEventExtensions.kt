package me.xaanit.d4j4k.event.domain

import discord4j.core.`object`.entity.User;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.UserUpdateEvent


fun UserUpdateEvent.old(): User? = old.orElse(null)
                