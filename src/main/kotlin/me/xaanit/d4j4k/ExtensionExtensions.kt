package me.xaanit.d4j4k

import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.reactive.awaitFirstOrNull
import kotlinx.coroutines.reactive.awaitSingle
import kotlinx.coroutines.reactive.openSubscription
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

internal suspend fun <T> Mono<T>.awaitNull(): T? = awaitFirstOrNull()
internal suspend fun <T> Mono<T>.await(): T = awaitSingle()
internal suspend fun <T> Flux<T>.await(): List<T> = collectList().await()
internal suspend fun <T> Flux<T>.infinite(): ReceiveChannel<T> = openSubscription()
internal fun <T> Optional<T>.grab(): T? = orElse(null)
internal suspend fun <T> Mono<T>.unit(): Unit = await().let{}