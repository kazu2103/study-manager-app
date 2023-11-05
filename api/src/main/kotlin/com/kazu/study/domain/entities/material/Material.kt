package com.kazu.study.domain.entities.material

import com.kazu.study.domain.value.material.Unit
import java.time.LocalDateTime
import java.util.*

class Material private constructor(
    id: UUID,
    objectiveId: UUID?,
    name: String,
    unit: Unit,
    targetAmount: Int,
    createdAt: LocalDateTime,
    updatedAt: LocalDateTime,
    deletedAt: LocalDateTime?,
) {
    companion object {
        fun new(
            objectiveId: UUID?,
            name: String,
            unit: Unit,
            targetAmount: Int,
        ) = Material(
            id = UUID.randomUUID(),
            objectiveId = objectiveId,
            name = name,
            unit = unit,
            targetAmount = targetAmount,
            createdAt = LocalDateTime.now(),
            updatedAt = LocalDateTime.now(),
            deletedAt = null,
        )

        fun regenerate(
            id: UUID,
            objectiveId: UUID?,
            name: String,
            unit: Unit,
            targetAmount: Int,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime,
            deletedAt: LocalDateTime?,
        ) = Material(
            id = id,
            objectiveId = objectiveId,
            name = name,
            unit = unit,
            targetAmount = targetAmount,
            createdAt = createdAt,
            updatedAt = updatedAt,
            deletedAt = deletedAt,
        )
    }
}