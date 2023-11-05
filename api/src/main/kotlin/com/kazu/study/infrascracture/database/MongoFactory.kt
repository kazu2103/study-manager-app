package com.kazu.study.infrascracture.database

import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import io.micronaut.context.annotation.Factory
import io.micronaut.context.annotation.Value

@Factory
class MongoFactory {

    @Value("\${database.mongodb.host}")
    lateinit var host: String

    @Value("\${database.mongodb.port}")
    lateinit var port: String

    @Value("\${database.mongodb.database}")
    lateinit var database: String

    fun mongoClient(): MongoClient {
        val username = System.getenv("MONGO_USERNAME")
        val password = System.getenv("MONGO_PASSWORD")
        val uri = "mongodb://${username}:${password}@${host}:${port}/${database}"

        return MongoClients.create(uri)
    }
}