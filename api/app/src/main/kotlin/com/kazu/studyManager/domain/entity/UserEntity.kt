package com.kazu.studyManager.domain.entity

import java.time.LocalDateTime

data class UserEntity(
  override val id: String,
  private val loginId: String,
  private val name: String,
  private val email: String,
  override val createdAt: LocalDateTime,
  override val updatedAt: LocalDateTime,
  override val deletedAt: LocalDateTime,
) : AbstractEntity