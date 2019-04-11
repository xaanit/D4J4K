package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.entity.Message
import discord4j.core.`object`.entity.MessageChannel
import discord4j.core.spec.MessageCreateSpec
import kotlinx.coroutines.reactive.awaitSingle
import java.util.function.Consumer

suspend fun MessageChannel.sendMessage(message: Consumer<MessageCreateSpec>): Message =
    createMessage(message).awaitSingle()