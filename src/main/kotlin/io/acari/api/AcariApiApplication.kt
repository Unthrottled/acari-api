package io.acari.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AcariApiApplication

fun main(args: Array<String>) {
    runApplication<AcariApiApplication>(*args)
}

