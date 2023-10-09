package com.kazu.studyManager.application.controller

import graphql.schema.DataFetcher
import graphql.schema.DataFetchingEnvironment
import io.micronaut.context.annotation.Factory
import jakarta.inject.Singleton

@Factory
class GraphQLDataFetchers {

  @Singleton
  fun hello(): DataFetcher<String> {
    return DataFetcher {
      "Hello, World!"
    }
  }
}