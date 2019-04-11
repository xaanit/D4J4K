package me.xaanit.d4j4k.`object`.reaction


import discord4j.core.`object`.reaction.ReactionEmoji


fun ReactionEmoji.custom(): ReactionEmoji.Custom? = asCustomEmoji().orElse(null)
fun ReactionEmoji.unicode(): ReactionEmoji.Unicode? = asUnicodeEmoji().orElse(null)
                