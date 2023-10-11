package com.kazu.studyManager.domain.entity

import java.time.LocalDateTime

sealed class AbstractEntity<T> {
  abstract val id: String
  abstract val createdAt: LocalDateTime
  abstract val updatedAt: LocalDateTime
  abstract val deletedAt: LocalDateTime

  companion object {
    fun create(): AbstractEntity = T
  }
}