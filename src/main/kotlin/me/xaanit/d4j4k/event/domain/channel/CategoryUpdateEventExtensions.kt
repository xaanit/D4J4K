package me.xaanit.d4j4k.event.domain.channel

import discord4j.core.`object`.entity.Category
import discord4j.core.event.domain.channel.CategoryUpdateEvent


fun CategoryUpdateEvent.old(): Category? = old.orElse(null)
                