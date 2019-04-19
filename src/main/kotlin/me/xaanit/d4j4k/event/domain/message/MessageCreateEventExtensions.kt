package me.xaanit.d4j4k.event.domain.message

import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.Member
import discord4j.core.`object`.util.Snowflake
import discord4j.core.event.domain.message.MessageCreateEvent
import me.xaanit.d4j4k.await
import me.xaanit.d4j4k.grab


fun MessageCreateEvent.guildId(): Snowflake? = guildId.grab()
suspend fun MessageCreateEvent.guild(): Guild = guild.await()
fun MessageCreateEvent.member(): Member? = member.grab()
                