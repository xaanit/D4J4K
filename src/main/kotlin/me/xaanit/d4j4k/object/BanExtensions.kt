package me.xaanit.d4j4k.object


import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.object.Ban


fun Ban.reason(): String? = reason.orElse(null)
                