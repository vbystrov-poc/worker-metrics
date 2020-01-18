package com.github.udavpit.workermetrics.routes

import com.github.udavpit.workermetrics.routes.handlers.WorkerHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.config.EnableWebFlux
import org.springframework.web.reactive.function.server.router

/**
 * Routes definition for '/api' URIs
 *
 * @author Vladimir Bystrov
 */
@Configuration
class ApiRoutes(private val workerHandler: WorkerHandler) {

    @Bean
    fun apiRouter() = router {
        (accept(MediaType.APPLICATION_JSON) and "/api").nest {
            "/workers".nest {
                GET("/", workerHandler::findAll)
                GET("/{id}", workerHandler::findOne)
                POST("/", workerHandler::create)
            }

        }
    }
}