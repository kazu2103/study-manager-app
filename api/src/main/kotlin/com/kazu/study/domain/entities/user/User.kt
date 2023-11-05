package com.kazu.study.domain.entities.user

import com.kazu.study.domain.value.shared.Email
import java.time.LocalDateTime
import java.util.*

class User private constructor(
    val id: UUID,
    val objectiveIds: List<UUID>,
    val materialIds: List<UUID>,
    val name: String,
    val email: Email,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val deletedAt: LocalDateTime?,
) {
    companion object {
        fun new(
            name: String,
            email: Email,
        ) = User(
            id = UUID.randomUUID(),
            objectiveIds = listOf(),
            materialIds = listOf(),
            name = name,
            email = email,
            createdAt = LocalDateTime.now(),
            updatedAt = LocalDateTime.now(),
            deletedAt = null,
        )

        fun regenerate(
            id: UUID,
            objectiveIds: List<UUID>,
            materialIds: List<UUID>,
            name: String,
            email: Email,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime,
            deletedAt: LocalDateTime?,
        ) = User(
            id = id,
            objectiveIds = objectiveIds,
            materialIds = materialIds,
            name = name,
            email = email,
            createdAt = createdAt,
            updatedAt = updatedAt,
            deletedAt = deletedAt,
        )
    }
}