package me.xaanit.d4j4k.object.reaction


import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.object.reaction.ReactionEmoji


fun ReactionEmoji.asCustomEmoji(): Custom? = asCustomEmoji.orElse(null)
fun ReactionEmoji.asUnicodeEmoji(): Unicode? = asUnicodeEmoji.orElse(null)
                