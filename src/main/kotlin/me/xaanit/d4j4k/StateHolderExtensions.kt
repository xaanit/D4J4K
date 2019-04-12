package me.xaanit.d4j4k


import discord4j.core.StateHolder


suspend fun StateHolder.awaitInvalidateStores(): Unit = invalidateStores().unit()
                