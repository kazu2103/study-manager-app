package com.kazu.study.application.usecases.user

import com.kazu.study.domain.entities.user.User
import com.kazu.study.domain.repositories.IUserRepository
import jakarta.inject.Singleton
import java.util.*

@Singleton
class FindUserUseCase(
    private val userRepository: IUserRepository,
) {
    fun execute(userId: UUID): User {
        val result = userRepository.findById(userId)

        return result ?: throw Exception("user not found. id: $userId")
    }
}