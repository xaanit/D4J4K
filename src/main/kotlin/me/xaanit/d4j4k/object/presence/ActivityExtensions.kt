package me.xaanit.d4j4k.`object`.presence

import discord4j.core.`object`.presence.Activity
import discord4j.core.`object`.util.Snowflake
import java.time.Instant


fun Activity.streamingUrl(): String? = streamingUrl.orElse(null)
fun Activity.start(): Instant? = start.orElse(null)
fun Activity.end(): Instant? = end.orElse(null)
fun Activity.applicationId(): Snowflake? = applicationId.orElse(null)
fun Activity.details(): String? = details.orElse(null)
fun Activity.state(): String? = state.orElse(null)
fun Activity.partyId(): String? = partyId.orElse(null)
fun Activity.largeImageId(): String? = largeImageId.orElse(null)
fun Activity.largeText(): String? = largeText.orElse(null)
fun Activity.smallImageId(): String? = smallImageId.orElse(null)
fun Activity.smallText(): String? = smallText.orElse(null)
                