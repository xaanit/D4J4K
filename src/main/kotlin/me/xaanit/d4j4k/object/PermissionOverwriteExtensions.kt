package me.xaanit.d4j4k.object

import discord4j.core.`object`.util.Snowflake;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.object.PermissionOverwrite


fun PermissionOverwrite.roleId(): Snowflake? = roleId.orElse(null)
fun PermissionOverwrite.memberId(): Snowflake? = memberId.orElse(null)
                