package com.kazu.study.application.usecases.user

import com.kazu.study.domain.entities.User
import com.kazu.study.domain.repositories.IUserRepository
import jakarta.inject.Singleton
import java.util.UUID

@Singleton
class FindUserUseCase(
    private val userRepository: IUserRepository,
) {
    fun execute(userId: UUID): User {
        val result = userRepository.findById(userId)

        if (result.isEmpty) {
            println("the user is not exist. userId: $userId")
        }

        return result.get()
    }
}