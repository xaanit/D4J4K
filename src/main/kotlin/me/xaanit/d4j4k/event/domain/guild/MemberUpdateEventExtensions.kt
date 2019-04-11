package me.xaanit.d4j4k.event.domain.guild

import discord4j.core.`object`.entity.Guild;
import discord4j.core.`object`.entity.Member;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.guild.MemberUpdateEvent


suspend fun MemberUpdateEvent.guild(): Guild = guild.awaitSingle()
suspend fun MemberUpdateEvent.member(): Member = member.awaitSingle()
fun MemberUpdateEvent.old(): Member? = old.orElse(null)
fun MemberUpdateEvent.currentNickname(): String? = currentNickname.orElse(null)
                