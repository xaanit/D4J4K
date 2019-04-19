package me.xaanit.d4j4k.event

import discord4j.core.event.EventDispatcher
import discord4j.core.event.domain.Event
import kotlinx.coroutines.channels.ReceiveChannel
import me.xaanit.d4j4k.infinite
import kotlin.reflect.KClass

fun <T : Event> EventDispatcher.on(clazz: KClass<T>): ReceiveChannel<T> = on(clazz.java).infinite()
