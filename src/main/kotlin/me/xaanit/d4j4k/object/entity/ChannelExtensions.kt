package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.entity.Channel
import me.xaanit.d4j4k.unit

/**
 * Requests to delete the channel.
 *
 * @param reason The reason why this is being deleted.
 */
suspend fun Channel.awaitDelete(reason: String? = null): Unit = delete(reason).unit()

