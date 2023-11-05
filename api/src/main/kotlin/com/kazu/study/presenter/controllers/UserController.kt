package com.kazu.study.presenter.controllers

import com.kazu.study.application.usecases.user.FindUserUseCase
import com.kazu.study.application.usecases.user.RegisterUserUseCase
import com.kazu.study.domain.entities.user.User
import com.kazu.study.domain.value.shared.Email
import io.micronaut.context.annotation.Parameter
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import java.util.*

@Controller("/")
class UserController(
    private val findUserUseCase: FindUserUseCase,
    private val registerUserUseCase: RegisterUserUseCase,
) {

    @Get("/user/{id}")
    fun findById(
        @Parameter id: String
    ): User {
        return findUserUseCase.execute(UUID.fromString(id))
    }

    @Post("/user")
    fun register(
        @Parameter name: String,
        @Parameter email: String
    ): User {
        val user = User.new(
            name = name,
            email = Email(email)
        )
        registerUserUseCase.execute(user)

        return user
    }
}