package io.acari.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.reactive.config.EnableWebFlux
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.HandlerFunction
import org.springframework.web.reactive.function.server.RequestPredicates
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerResponse

@EnableWebFlux
@SpringBootApplication
class AcariApiApplication

@Component
class RouterComponent {
    @Bean
    fun apiRouterFunction() =
            RouterFunctions.route(RequestPredicates.GET("/hello"), HandlerFunction {
                ServerResponse.ok().body(BodyInserters.fromObject("""
                    Hello World!
                    Go Away!""".trimIndent()))
            })
}

fun main(args: Array<String>) {
    runApplication<AcariApiApplication>(*args)
}

