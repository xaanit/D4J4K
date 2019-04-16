package me.xaanit.d4j4k.`object`.presence


import discord4j.core.`object`.presence.Activity
import discord4j.core.`object`.presence.Presence
import me.xaanit.d4j4k.grab

/**
 * Grabs the activity for this presence.
 *
 * @return The nullable [Activity].
 */
fun Presence.activity(): Activity? = activity.grab()
                