package me.xaanit.d4j4k.`object`.entity


import discord4j.core.`object`.entity.Category
import discord4j.core.`object`.entity.GuildChannel
import kotlinx.coroutines.reactive.awaitSingle


suspend fun Category.channels(): List<GuildChannel> = channels.collectList().awaitSingle()
                