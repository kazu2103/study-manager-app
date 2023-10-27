package com.kazu.studyManager.domain.repositories

import com.kazu.studyManager.domain.entities.User

interface IUserRepository {
    fun findById(): User
    fun save()
}