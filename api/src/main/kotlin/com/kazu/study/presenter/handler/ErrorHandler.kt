package com.kazu.study.presenter.handler

import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Error

@Controller("/error")
class ErrorHandler {

    @Error(global = true)
    fun internalServerError(): HttpResponse<*> {
        return HttpResponse
            .status<String>(HttpStatus.INTERNAL_SERVER_ERROR)
            .body("Internal Server Error")
    }
}