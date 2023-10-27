package com.kazu.studyManager.domain.entities

import com.kazu.studyManager.domain.values.Id
import java.time.LocalDateTime

sealed class Entity {
    abstract val id: Id
    abstract val createdAt: LocalDateTime
    abstract val updatedAt: LocalDateTime
    abstract val deletedAt: LocalDateTime?
}