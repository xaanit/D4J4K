package me.xaanit.d4j4k.event.domain.guild

import discord4j.core.`object`.entity.Guild
import discord4j.core.event.domain.guild.GuildUpdateEvent
import me.xaanit.d4j4k.grab


fun GuildUpdateEvent.old(): Guild? = old.grab()
                