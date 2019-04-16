package me.xaanit.d4j4k.`object`

import discord4j.core.`object`.ExtendedInvite
import discord4j.core.`object`.entity.User
import me.xaanit.d4j4k.await
import me.xaanit.d4j4k.grab
import java.time.Instant

/**
 * Requests to retrieve the user who created the invite.
 *
 * @return A suspended call to the [reactor.core.publisher.Mono] where, upon successful competition, returns
 * the [User] who made the invite. If an error is received it's thrown.
 */
suspend fun ExtendedInvite.inviter(): User = inviter.await()

/**
 * Gets the expiration of the invite.
 *
 * @return The nullable expiration of the invite.
 */
fun ExtendedInvite.expiration(): Instant? = expiration.grab()
                
