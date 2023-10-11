package com.kazu.studyManager.domain.entity

import java.time.LocalDateTime
import java.util.Date

data class ObjectiveEntity (
  override val id: String,
  private val name: String,
  private val description: String,
  private val startDate: Date,
  private val dueDate: Date,
  override val createdAt: LocalDateTime,
  override val updatedAt: LocalDateTime,
  override val deletedAt: LocalDateTime
): AbstractEntity