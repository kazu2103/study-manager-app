package com.kazu.study.domain.entities

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import java.time.LocalDateTime
import java.util.*

@MappedEntity
class User(
    @Id
    @GeneratedValue
    val id: UUID,
    val name: String,
    val email: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val deletedAt: LocalDateTime?,
) {
    companion object {
        fun new(
            name: String,
            email: String
        ) = User(
            id = UUID.randomUUID(),
            name = name,
            email = email,
            createdAt = LocalDateTime.now(),
            updatedAt = LocalDateTime.now(),
            deletedAt = null,
        )
    }
}