package me.xaanit.d4j4k.event.domain.guild

import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.Member
import discord4j.core.event.domain.guild.MemberLeaveEvent
import me.xaanit.d4j4k.await
import me.xaanit.d4j4k.grab


suspend fun MemberLeaveEvent.guild(): Guild = guild.await()
fun MemberLeaveEvent.member(): Member? = member.grab()
                