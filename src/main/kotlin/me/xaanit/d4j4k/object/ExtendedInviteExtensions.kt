package me.xaanit.d4j4k.`object`

import discord4j.core.`object`.ExtendedInvite
import discord4j.core.`object`.entity.User
import kotlinx.coroutines.reactive.awaitSingle
import java.time.Instant


suspend fun ExtendedInvite.inviter(): User = inviter.awaitSingle()
fun ExtendedInvite.expiration(): Instant? = expiration.orElse(null)
                
