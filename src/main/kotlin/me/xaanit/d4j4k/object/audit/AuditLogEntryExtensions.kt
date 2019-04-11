package me.xaanit.d4j4k.`object`.audit

import discord4j.core.`object`.audit.AuditLogEntry
import discord4j.core.`object`.util.Snowflake


fun AuditLogEntry.targetId(): Snowflake? = targetId.orElse(null)
fun AuditLogEntry.reason(): String? = reason.orElse(null)
                