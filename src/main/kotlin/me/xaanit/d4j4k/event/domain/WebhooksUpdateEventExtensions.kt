package me.xaanit.d4j4k.event.domain

import discord4j.core.`object`.entity.Guild;
import discord4j.core.`object`.entity.TextChannel;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.WebhooksUpdateEvent


suspend fun WebhooksUpdateEvent.guild(): Guild = guild.awaitSingle()
suspend fun WebhooksUpdateEvent.channel(): TextChannel = channel.awaitSingle()
                