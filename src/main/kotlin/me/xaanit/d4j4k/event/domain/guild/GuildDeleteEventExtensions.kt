package me.xaanit.d4j4k.event.domain.guild

import discord4j.core.`object`.entity.Guild
import discord4j.core.event.domain.guild.GuildDeleteEvent
import me.xaanit.d4j4k.grab


fun GuildDeleteEvent.guild(): Guild? = guild.grab()
                