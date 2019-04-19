package me.xaanit.d4j4k.event.domain.channel

import discord4j.core.`object`.entity.TextChannel
import discord4j.core.event.domain.channel.TextChannelUpdateEvent
import me.xaanit.d4j4k.grab


fun TextChannelUpdateEvent.old(): TextChannel? = old.grab()
                