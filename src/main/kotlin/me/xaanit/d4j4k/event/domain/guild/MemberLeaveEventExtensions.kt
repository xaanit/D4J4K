package me.xaanit.d4j4k.event.domain.guild

import discord4j.core.`object`.entity.Guild;
import discord4j.core.`object`.entity.Member;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.guild.MemberLeaveEvent


suspend fun MemberLeaveEvent.guild(): Guild = guild.awaitSingle()
fun MemberLeaveEvent.member(): Member? = member.orElse(null)
                