package me.xaanit.d4j4k.shard


import discord4j.core.shard.ShardAwareStore
import kotlinx.coroutines.reactive.awaitSingle
import java.io.Serializable

suspend fun <K : Comparable<K>, V : Serializable> ShardAwareStore<K, V>.size(): Long = count().awaitSingle()
suspend fun <K : Comparable<K>, V : Serializable> ShardAwareStore<K, V>.delete(): Unit =
    deleteAll().awaitSingle().let {}

suspend fun <K : Comparable<K>, V : Serializable> ShardAwareStore<K, V>.keyList(): List<K> =
    keys().collectList().awaitSingle()

suspend fun <K : Comparable<K>, V : Serializable> ShardAwareStore<K, V>.valuesList(): List<V> =
    values().collectList().awaitSingle()

suspend fun <K : Comparable<K>, V : Serializable> ShardAwareStore<K, V>.invalidateData(): Unit =
    invalidate().awaitSingle().let {}
                