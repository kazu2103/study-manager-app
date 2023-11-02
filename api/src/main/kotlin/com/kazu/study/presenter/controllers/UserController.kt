package com.kazu.study.presenter.controllers

import com.kazu.study.application.usecases.user.RegisterUserUseCase
import com.kazu.study.domain.entities.User
import io.micronaut.context.annotation.Parameter
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/")
class UserController(
    private val registerUserUseCase: RegisterUserUseCase,
) {

    @Get("/user/{id}")
    fun findById(
        @Parameter id: String
    ): User {
        TODO()
    }

    @Post("/user")
    fun register(
        @Parameter name: String,
        @Parameter email: String
    ): User {
        val user = User.new(
            name = name,
            email = email
        )
        registerUserUseCase.execute(user)

        return user
    }
}