package me.xaanit.d4j4k.`object`.audit


import discord4j.core.`object`.audit.AuditLogChange
import me.xaanit.d4j4k.grab


fun <T> AuditLogChange<T>.oldValue(): T? = oldValue.grab()
fun <T> AuditLogChange<T>.currentValue(): T? = currentValue.grab()
                