package me.xaanit.d4j4k.`object`.presence


import discord4j.core.`object`.presence.Activity
import discord4j.core.`object`.presence.Presence


fun Presence.activity(): Activity? = activity.orElse(null)
                