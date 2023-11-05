package com.kazu.study.domain.value.shared

data class Email(
    val value: String
) {
    init {
        val emailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.+[a-z]+"
        val regex = Regex(emailPattern)
        if (!regex.matches(value)) {
            throw IllegalArgumentException("Invalid email format")
        }
    }
}
