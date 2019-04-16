package me.xaanit.d4j4k.`object`.entity

import discord4j.core.`object`.ExtendedPermissionOverwrite
import discord4j.core.`object`.PermissionOverwrite
import discord4j.core.`object`.entity.Guild
import discord4j.core.`object`.entity.GuildChannel
import discord4j.core.`object`.util.PermissionSet
import discord4j.core.`object`.util.Snowflake
import me.xaanit.d4j4k.await
import me.xaanit.d4j4k.awaitNull
import me.xaanit.d4j4k.grab
import me.xaanit.d4j4k.unit

suspend fun GuildChannel.guild(): Guild = guild.await()
fun GuildChannel.awaitOverwriteForMember(id: Snowflake): ExtendedPermissionOverwrite? = getOverwriteForMember(id).grab()
fun GuildChannel.awaitOverwriteForRole(id: Snowflake): ExtendedPermissionOverwrite? = getOverwriteForRole(id).grab()
suspend fun GuildChannel.awaitEffectivePermissions(id: Snowflake): PermissionSet? =
    getEffectivePermissions(id).awaitNull()

suspend fun GuildChannel.position(): Int = position.await()
suspend fun GuildChannel.awaitAddMemberOverwrite(
    id: Snowflake,
    overwrite: PermissionOverwrite,
    reason: String? = null
): Unit = addMemberOverwrite(id, overwrite, reason).unit()

suspend fun GuildChannel.awaitAddRoleOverwrite(
    id: Snowflake,
    overwrite: PermissionOverwrite,
    reason: String? = null
): Unit = addRoleOverwrite(id, overwrite, reason).unit()

