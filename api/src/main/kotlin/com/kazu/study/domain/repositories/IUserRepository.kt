package com.kazu.study.domain.repositories

import com.kazu.study.domain.entities.user.User
import jakarta.inject.Singleton
import java.util.*

@Singleton
interface IUserRepository {
    fun findById(id: UUID): User?
    fun save(user: User)
}
