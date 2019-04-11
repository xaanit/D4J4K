package me.xaanit.d4j4k.object

import discord4j.core.`object`.entity.Guild;
import discord4j.core.`object`.entity.GuildChannel;
import discord4j.core.`object`.entity.Role;
import discord4j.core.`object`.entity.User;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.object.ExtendedPermissionOverwrite


suspend fun ExtendedPermissionOverwrite.role(): Role = role.awaitSingle()
suspend fun ExtendedPermissionOverwrite.user(): User = user.awaitSingle()
suspend fun ExtendedPermissionOverwrite.guild(): Guild = guild.awaitSingle()
suspend fun ExtendedPermissionOverwrite.channel(): GuildChannel = channel.awaitSingle()
suspend fun ExtendedPermissionOverwrite.delete(): Unit = delete.awaitSingle().let{}
                