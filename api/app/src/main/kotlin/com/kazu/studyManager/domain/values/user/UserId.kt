package com.kazu.studyManager.domain.values.user

import com.kazu.studyManager.domain.values.Id
import java.util.UUID

data class UserId(
    val value: UUID
): Id() {
    companion object {
        fun generate(): UserId {
            return UserId(UUID.randomUUID())
        }
    }
}
