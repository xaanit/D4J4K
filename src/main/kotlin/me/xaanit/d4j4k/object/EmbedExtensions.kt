package me.xaanit.d4j4k.`object`

import discord4j.core.`object`.Embed
import java.awt.Color
import java.time.Instant


fun Embed.title(): String? = title.orElse(null)
fun Embed.description(): String? = description.orElse(null)
fun Embed.url(): String? = url.orElse(null)
fun Embed.timestamp(): Instant? = timestamp.orElse(null)
fun Embed.color(): Color? = color.orElse(null)
fun Embed.footer(): Embed.Footer? = footer.orElse(null)
fun Embed.image(): Embed.Image? = image.orElse(null)
fun Embed.thumbnail(): Embed.Thumbnail? = thumbnail.orElse(null)
fun Embed.video(): Embed.Video? = video.orElse(null)
fun Embed.provider(): Embed.Provider? = provider.orElse(null)
fun Embed.author(): Embed.Author? = author.orElse(null)
                
