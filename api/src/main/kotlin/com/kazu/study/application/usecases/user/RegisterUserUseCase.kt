package com.kazu.study.application.usecases.user

import com.kazu.study.domain.entities.user.User
import com.kazu.study.domain.repositories.IUserRepository
import jakarta.inject.Singleton

@Singleton
class RegisterUserUseCase(
    private val userRepository: IUserRepository
) {
    fun execute(user: User) {
        userRepository.save(user)
    }
}