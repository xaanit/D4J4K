package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.VoiceState
import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.Member
import discord4j.core.`object`.entity.Role
import discord4j.core.`object`.presence.Presence
import discord4j.core.`object`.util.PermissionSet
import kotlinx.coroutines.reactive.awaitSingle
import java.awt.Color


suspend fun Member.roles(): List<Role> = roles.collectList().awaitSingle()
suspend fun Member.highestRole(): Role = highestRole.awaitSingle()
suspend fun Member.guild(): Guild = guild.awaitSingle()
fun Member.nickname(): String? = nickname.orElse(null)
suspend fun Member.voiceState(): VoiceState = voiceState.awaitSingle()
suspend fun Member.presence(): Presence = presence.awaitSingle()
suspend fun Member.kickMember(): Unit = kick().awaitSingle().let {}
suspend fun Member.unbanMember(): Unit = unban().awaitSingle().let {}
suspend fun Member.basePermissions(): PermissionSet = basePermissions.awaitSingle()
suspend fun Member.color(): Color = color.awaitSingle()
                