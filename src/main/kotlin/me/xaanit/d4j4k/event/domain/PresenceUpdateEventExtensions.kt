package me.xaanit.d4j4k.event.domain

import discord4j.core.`object`.entity.Guild;
import discord4j.core.`object`.entity.Member;
import discord4j.core.`object`.entity.User;
import discord4j.core.`object`.presence.Presence;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.PresenceUpdateEvent


suspend fun PresenceUpdateEvent.guild(): Guild = guild.awaitSingle()
fun PresenceUpdateEvent.oldUser(): User? = oldUser.orElse(null)
fun PresenceUpdateEvent.newUsername(): String? = newUsername.orElse(null)
fun PresenceUpdateEvent.newDiscriminator(): String? = newDiscriminator.orElse(null)
fun PresenceUpdateEvent.newAvatar(): String? = newAvatar.orElse(null)
suspend fun PresenceUpdateEvent.user(): User = user.awaitSingle()
suspend fun PresenceUpdateEvent.member(): Member = member.awaitSingle()
fun PresenceUpdateEvent.old(): Presence? = old.orElse(null)
                