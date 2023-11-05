package com.kazu.study.domain.entities.study

import java.time.LocalDateTime
import java.util.*

interface Study {
    val id: UUID
    val materialId: UUID
    val startAt: LocalDateTime?
    val endAt: LocalDateTime?
    val amount: Int
    val createdAt: LocalDateTime
    val updatedAt: LocalDateTime
    val deletedAt: LocalDateTime?
}
