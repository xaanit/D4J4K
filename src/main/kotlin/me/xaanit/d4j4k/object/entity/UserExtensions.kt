package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.entity.Member
import discord4j.core.`object`.entity.PrivateChannel
import discord4j.core.`object`.entity.User
import discord4j.core.`object`.util.Image
import discord4j.core.`object`.util.Snowflake
import me.xaanit.d4j4k.await
import me.xaanit.d4j4k.awaitNull
import me.xaanit.d4j4k.grab

fun User.awaitAvatarUrl(format: Image.Format): String? = getAvatarUrl(format).grab()
suspend fun User.awaitAsMember(id: Snowflake): Member? = asMember(id).awaitNull()
suspend fun User.privateChannel(): PrivateChannel = privateChannel.await()
