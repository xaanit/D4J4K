package me.xaanit.d4j4k.event.domain.message

import discord4j.core.`object`.entity.Guild;
import discord4j.core.`object`.entity.Member;
import discord4j.core.`object`.util.Snowflake;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.event.domain.message.MessageCreateEvent


fun MessageCreateEvent.guildId(): Snowflake? = guildId.orElse(null)
suspend fun MessageCreateEvent.guild(): Guild = guild.awaitSingle()
fun MessageCreateEvent.member(): Member? = member.orElse(null)
                