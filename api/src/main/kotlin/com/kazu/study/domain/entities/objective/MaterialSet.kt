package com.kazu.study.domain.entities.objective

import java.time.LocalDate
import java.util.*

class MaterialSet private constructor(
    val id: UUID,
    val materialIds: List<UUID>,
    val createdAt: LocalDate,
    val updatedAt: LocalDate,
    val deletedAt: LocalDate?,
)