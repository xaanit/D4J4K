package me.xaanit.d4j4k.object.entity


import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.object.entity.PrivateChannel


suspend fun PrivateChannel.recipients(): List<User> = recipients.collectList().awaitSingle()
                