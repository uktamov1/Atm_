package com.example.atm_

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AtmApplication

fun main(args: Array<String>) {
    runApplication<AtmApplication>(*args)
}
