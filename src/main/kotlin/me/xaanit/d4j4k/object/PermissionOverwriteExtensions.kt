package me.xaanit.d4j4k.`object`

import discord4j.core.`object`.PermissionOverwrite
import discord4j.core.`object`.util.Snowflake


fun PermissionOverwrite.roleId(): Snowflake? = roleId.orElse(null)
fun PermissionOverwrite.memberId(): Snowflake? = memberId.orElse(null)
                
