package com.kazu.studyManager.domain.entities

import com.kazu.studyManager.domain.values.user.UserId
import java.time.LocalDateTime

class User(
    override val id: UserId,
    val loginId: String,
    val name: String,
    val email: String,
    override val createdAt: LocalDateTime,
    override val updatedAt: LocalDateTime,
    override val deletedAt: LocalDateTime?,
) : Entity() {

    companion object {
        fun new(
            loginId: String,
            name: String,
            email: String,
        ) = User(
            id = UserId.generate(),
            loginId = loginId,
            name = name,
            email = email,
            createdAt = LocalDateTime.now(),
            updatedAt = LocalDateTime.now(),
            deletedAt = null,
        )

        fun regenerate(
            id: UserId,
            loginId: String,
            name: String,
            email: String,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime,
            deletedAt: LocalDateTime,
        ): User = User(
            id,
            loginId,
            name,
            email,
            createdAt,
            updatedAt,
            deletedAt,
        )
    }
}