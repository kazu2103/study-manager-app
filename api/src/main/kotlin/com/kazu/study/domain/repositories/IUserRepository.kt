package com.kazu.study.domain.repositories

import com.kazu.study.domain.entities.User
import io.micronaut.data.mongodb.annotation.MongoRepository
import io.micronaut.data.repository.CrudRepository
import java.util.*

@MongoRepository
interface IUserRepository : CrudRepository<User, UUID> {
    override fun delete(entity: User) {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: MutableIterable<User>) {
        TODO("Not yet implemented")
    }
}

data class UserDocument(
    val _id: UUID,
    val name: String,
    val email: String,
    val createdAt: String,
    val updatedAt: String,
    val deletedAt: String?,
)