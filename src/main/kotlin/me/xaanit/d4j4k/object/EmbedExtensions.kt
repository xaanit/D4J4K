package me.xaanit.d4j4k.object

import java.awt.Color;
import java.time.Instant;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.object.Embed


fun Embed.title(): String? = title.orElse(null)
fun Embed.description(): String? = description.orElse(null)
fun Embed.url(): String? = url.orElse(null)
fun Embed.timestamp(): Instant? = timestamp.orElse(null)
fun Embed.color(): Color? = color.orElse(null)
fun Embed.footer(): Footer? = footer.orElse(null)
fun Embed.image(): Image? = image.orElse(null)
fun Embed.thumbnail(): Thumbnail? = thumbnail.orElse(null)
fun Embed.video(): Video? = video.orElse(null)
fun Embed.provider(): Provider? = provider.orElse(null)
fun Embed.author(): Author? = author.orElse(null)
                