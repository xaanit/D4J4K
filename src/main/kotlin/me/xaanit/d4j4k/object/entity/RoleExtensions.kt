package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.Role
import discord4j.core.spec.RoleEditSpec
import me.xaanit.d4j4k.await
import me.xaanit.d4j4k.unit

suspend fun Role.position(): Int = position.await()
suspend fun Role.guild(): Guild = guild.await()
suspend fun Role.update(spec: (RoleEditSpec) -> Unit): Role = edit(spec).await()
suspend fun Role.awaitDelete(reason: String? = null): Unit = delete(reason).unit()
suspend fun Role.awaitChangePosition(position: Int): List<Role> = changePosition(position).await()
