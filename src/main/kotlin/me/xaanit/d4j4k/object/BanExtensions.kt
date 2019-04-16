package me.xaanit.d4j4k.`object`


import discord4j.core.`object`.Ban
import me.xaanit.d4j4k.grab


/**
 * Gets the reason for the ban.
 *
 * @return The nullable reason for the ban.
 */
fun Ban.reason(): String? = reason.grab()
                
