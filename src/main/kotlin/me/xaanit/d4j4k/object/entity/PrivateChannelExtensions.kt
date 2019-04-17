package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.entity.PrivateChannel
import discord4j.core.`object`.entity.User
import me.xaanit.d4j4k.await

suspend fun PrivateChannel.recipients(): List<User> = recipients.await()