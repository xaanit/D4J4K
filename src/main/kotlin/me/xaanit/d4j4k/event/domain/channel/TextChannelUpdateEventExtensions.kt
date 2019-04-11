package me.xaanit.d4j4k.event.domain.channel

import discord4j.core.`object`.entity.TextChannel;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.channel.TextChannelUpdateEvent


fun TextChannelUpdateEvent.old(): TextChannel? = old.orElse(null)
                