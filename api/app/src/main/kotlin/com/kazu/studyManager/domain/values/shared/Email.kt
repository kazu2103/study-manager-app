package com.kazu.studyManager.domain.values.shared

import org.slf4j.Logger
import org.slf4j.LoggerFactory

data class Email(
    val value: String
) {

    private val logger: Logger = LoggerFactory.getLogger()
    companion object {
        fun new(value: String): Email? {
            if (!validate(value)) {

                return null
            }
        }

        private fun validate(value: String): Boolean {
            val regex = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})".toRegex()
            return regex.matches(value)
        }
    }


}
