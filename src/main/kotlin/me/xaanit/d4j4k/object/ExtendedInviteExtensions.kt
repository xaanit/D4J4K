package me.xaanit.d4j4k.object

import discord4j.core.`object`.entity.User;
import java.time.Instant;

import kotlinx.coroutines.reactive.awaitSingle
import discord4j.core.object.ExtendedInvite


suspend fun ExtendedInvite.inviter(): User = inviter.awaitSingle()
fun ExtendedInvite.expiration(): Instant? = expiration.orElse(null)
                