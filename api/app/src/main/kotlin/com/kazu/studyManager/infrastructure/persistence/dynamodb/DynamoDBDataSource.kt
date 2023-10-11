package com.kazu.studyManager.infrastructure.persistence.dynamodb

import jakarta.inject.Singleton
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.dynamodb.DynamoDbClient

@Singleton
class DynamoDBDataSource {
  val client: DynamoDbClient = DynamoDbClient.builder()
    .region(Region.AP_NORTHEAST_1)
    .build()
}