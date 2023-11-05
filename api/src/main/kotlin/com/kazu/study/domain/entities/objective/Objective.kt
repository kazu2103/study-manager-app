package com.kazu.study.domain.entities.objective

import java.time.LocalDate
import java.util.*

class Objective private constructor(
    val id: UUID,
    val materialSetId: UUID,
    val name: String,
    val description: String,
    val startDate: LocalDate,
    val dueDate: LocalDate,
    val createdAt: LocalDate,
    val updatedAt: LocalDate,
    val deletedAt: LocalDate?,
) {
    companion object {
        fun new(
            materialSetId: UUID,
            name: String,
            description: String,
            startDate: LocalDate,
            dueDate: LocalDate,
        ) = Objective(
            id = UUID.randomUUID(),
            materialSetId = materialSetId,
            name = name,
            description = description,
            startDate = startDate,
            dueDate = dueDate,
            createdAt = LocalDate.now(),
            updatedAt = LocalDate.now(),
            deletedAt = null,
        )

        fun regenerate(
            id: UUID,
            materialSetId: UUID,
            name: String,
            description: String,
            startDate: LocalDate,
            dueDate: LocalDate,
            createdAt: LocalDate,
            updatedAt: LocalDate,
            deletedAt: LocalDate?,
        ) = Objective(
            id = id,
            materialSetId = materialSetId,
            name = name,
            description = description,
            startDate = startDate,
            dueDate = dueDate,
            createdAt = createdAt,
            updatedAt = updatedAt,
            deletedAt = deletedAt,
        )
    }
}