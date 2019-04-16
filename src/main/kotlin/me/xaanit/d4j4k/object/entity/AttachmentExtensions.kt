package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.entity.Attachment
import me.xaanit.d4j4k.grab

/**
 * Grabs the height of the attachment.
 *
 * @return The nullable height of the attachment.
 */
fun Attachment.height(): Int? = height.grab()

/**
 * Grabs the width of the attachment.
 *
 * @return The nullable width of the attachment.
 */
fun Attachment.width(): Int? = width.grab()
