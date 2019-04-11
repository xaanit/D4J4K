package me.xaanit.d4j4k.object.presence


import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.object.presence.Presence


fun Presence.activity(): Activity? = activity.orElse(null)
                