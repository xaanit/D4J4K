package me.xaanit.d4j4k.event.domain.guild

import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.Member
import discord4j.core.event.domain.guild.MemberUpdateEvent
import me.xaanit.d4j4k.await
import me.xaanit.d4j4k.grab


suspend fun MemberUpdateEvent.guild(): Guild = guild.await()
suspend fun MemberUpdateEvent.member(): Member = member.await()
fun MemberUpdateEvent.old(): Member? = old.grab()
fun MemberUpdateEvent.currentNickname(): String? = currentNickname.grab()
                