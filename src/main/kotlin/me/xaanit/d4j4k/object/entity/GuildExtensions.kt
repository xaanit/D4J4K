package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.Ban
import discord4j.core.`object`.ExtendedInvite
import discord4j.core.`object`.Region
import discord4j.core.`object`.VoiceState
import discord4j.core.`object`.audit.AuditLogEntry
import discord4j.core.`object`.entity.*
import discord4j.core.`object`.presence.Presence
import discord4j.core.`object`.util.Snowflake
import kotlinx.coroutines.reactive.awaitSingle
import java.time.Instant


suspend fun Guild.owner(): Member = owner.awaitSingle()
suspend fun Guild.region(): Region = region.awaitSingle()
suspend fun Guild.regions(): List<Region> = regions.collectList().awaitSingle()
fun Guild.afkChannelId(): Snowflake? = afkChannelId.orElse(null)
suspend fun Guild.afkChannel(): VoiceChannel = afkChannel.awaitSingle()
fun Guild.embedChannelId(): Snowflake? = embedChannelId.orElse(null)
suspend fun Guild.embedChannel(): GuildChannel = embedChannel.awaitSingle()
suspend fun Guild.roles(): List<Role> = roles.collectList().awaitSingle()
suspend fun Guild.everyoneRole(): Role = everyoneRole.awaitSingle()
suspend fun Guild.emojis(): List<GuildEmoji> = emojis.collectList().awaitSingle()
fun Guild.applicationId(): Snowflake? = applicationId.orElse(null)
fun Guild.widgetChannelId(): Snowflake? = widgetChannelId.orElse(null)
suspend fun Guild.widgetChannel(): GuildChannel = widgetChannel.awaitSingle()
fun Guild.systemChannelId(): Snowflake? = systemChannelId.orElse(null)
suspend fun Guild.systemChannel(): TextChannel = systemChannel.awaitSingle()
fun Guild.joinTime(): Instant? = joinTime.orElse(null)
fun Guild.isLarge(): Boolean? = isLarge.orElse(null)
suspend fun Guild.voiceStates(): List<VoiceState> = voiceStates.collectList().awaitSingle()
suspend fun Guild.members(): List<Member> = members.collectList().awaitSingle()
suspend fun Guild.channels(): List<GuildChannel> = channels.collectList().awaitSingle()
suspend fun Guild.presences(): List<Presence> = presences.collectList().awaitSingle()
suspend fun Guild.eradicate(): Unit = delete().awaitSingle().let {}
suspend fun Guild.bans(): List<Ban> = bans.collectList().awaitSingle()
suspend fun Guild.exit(): Unit = leave().awaitSingle().let {}
suspend fun Guild.auditLog(): List<AuditLogEntry> = auditLog.collectList().awaitSingle()
suspend fun Guild.webhooks(): List<Webhook> = webhooks.collectList().awaitSingle()
suspend fun Guild.invites(): List<ExtendedInvite> = invites.collectList().awaitSingle()
                