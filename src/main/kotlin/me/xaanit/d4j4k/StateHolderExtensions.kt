package me.xaanit.d4j4k


import discord4j.core.StateHolder
import kotlinx.coroutines.reactive.awaitSingle


suspend fun StateHolder.invalidate(): Unit = invalidateStores().awaitSingle().let{}
                