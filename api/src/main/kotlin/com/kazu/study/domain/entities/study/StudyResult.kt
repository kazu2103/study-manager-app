package com.kazu.study.domain.entities.study

import java.time.LocalDateTime
import java.util.*

class StudyResult private constructor(
    override val id: UUID,
    override val materialId: UUID,
    override val startAt: LocalDateTime?,
    override val endAt: LocalDateTime?,
    override val amount: Int,
    override val createdAt: LocalDateTime,
    override val updatedAt: LocalDateTime,
    override val deletedAt: LocalDateTime?,
) : Study {
    companion object {
        fun new(
            materialId: UUID,
            startAt: LocalDateTime?,
            endAt: LocalDateTime?,
            amount: Int,
        ) = StudyResult(
            id = UUID.randomUUID(),
            materialId = materialId,
            startAt = startAt,
            endAt = endAt,
            amount = amount,
            createdAt = LocalDateTime.now(),
            updatedAt = LocalDateTime.now(),
            deletedAt = null,
        )

        fun reconstruct(
            id: UUID,
            materialId: UUID,
            startAt: LocalDateTime?,
            endAt: LocalDateTime?,
            amount: Int,
            createdAt: LocalDateTime,
            updatedAt: LocalDateTime,
            deletedAt: LocalDateTime?,
        ) = StudyResult(
            id = id,
            materialId = materialId,
            startAt = startAt,
            endAt = endAt,
            amount = amount,
            createdAt = createdAt,
            updatedAt = updatedAt,
            deletedAt = deletedAt,
        )
    }
}