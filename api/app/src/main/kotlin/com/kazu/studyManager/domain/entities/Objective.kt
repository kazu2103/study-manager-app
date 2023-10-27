package com.kazu.studyManager.domain.entities

import com.kazu.studyManager.domain.values.user.UserId
import java.time.LocalDateTime
import java.util.Date

data class Objective (
    override val id: UserId,
    private val name: String,
    private val description: String,
    private val startDate: Date,
    private val dueDate: Date,
    override val createdAt: LocalDateTime,
    override val updatedAt: LocalDateTime,
    override val deletedAt: LocalDateTime
): Entity()