package me.xaanit.d4j4k.`object`.audit


import discord4j.core.`object`.audit.AuditLogChange


fun <T> AuditLogChange<T>.oldValue(): T? = oldValue.orElse(null)
fun <T> AuditLogChange<T>.currentValue(): T? = currentValue.orElse(null)
                