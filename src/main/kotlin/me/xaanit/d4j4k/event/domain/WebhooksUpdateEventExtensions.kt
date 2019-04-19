package me.xaanit.d4j4k.event.domain;

import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.TextChannel
import discord4j.core.event.domain.WebhooksUpdateEvent
import me.xaanit.d4j4k.await


suspend fun WebhooksUpdateEvent.guild(): Guild = guild.await()
suspend fun WebhooksUpdateEvent.channel(): TextChannel = channel.await()
                