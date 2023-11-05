package com.kazu.study.infrascracture.repositories

import com.kazu.study.domain.entities.user.User
import com.kazu.study.domain.repositories.IUserRepository
import com.kazu.study.domain.value.shared.Email
import com.mongodb.client.MongoClient
import io.micronaut.context.annotation.Value
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import jakarta.inject.Singleton
import org.bson.Document
import java.time.LocalDateTime
import java.util.*

@Singleton
class UserRepository(
    private val mongoClient: MongoClient
) : IUserRepository {

    @Value("\${database.mongodb.database}")
    lateinit var database: String

    private val collection = "users"

    private fun getCollection() = mongoClient
        .getDatabase(database)
        .getCollection(collection, UserDocument::class.java)

    override fun findById(id: UUID): User? {
        val query = Document("_id", id.toString())
        val document = getCollection().find(query).first()

        return if (document != null) {
            User.regenerate(
                id = UUID.fromString(document.id),
                objectiveIds = document.objectiveIds.map { UUID.fromString(it) },
                materialIds = document.materialIds.map { UUID.fromString(it) },
                name = document.name,
                email = Email(document.email),
                createdAt = document.createdAt,
                updatedAt = document.updatedAt,
                deletedAt = document.deletedAt,
            )
        } else {
            null
        }
    }

    override fun save(user: User) {
        println(user.id)
        getCollection().insertOne(UserDocument.fromEntity(user))
    }
}

@MappedEntity
private data class UserDocument(
    @field:Id
    val id: String,
    val objectiveIds: List<String>,
    val materialIds: List<String>,
    val name: String,
    val email: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val deletedAt: LocalDateTime?,
) {
    companion object {
        fun fromEntity(user: User) = UserDocument(
            id = user.id.toString(),
            objectiveIds = user.objectiveIds.map { it.toString() },
            materialIds = user.materialIds.map { it.toString() },
            name = user.name,
            email = user.email.value,
            createdAt = user.createdAt,
            updatedAt = user.updatedAt,
            deletedAt = user.deletedAt,
        )
    }
}