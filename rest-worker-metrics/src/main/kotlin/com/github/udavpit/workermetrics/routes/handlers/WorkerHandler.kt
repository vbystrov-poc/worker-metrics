package com.github.udavpit.workermetrics.routes.handlers

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.json
import reactor.core.publisher.Mono

/**
 * WorkerHandler
 *
 * @author Vladimir Bystrov
 */
@Component
class WorkerHandler {

    fun findAll(request: ServerRequest): Mono<ServerResponse> {
        return ServerResponse.ok().json().bodyValue(listOf("Test1", "Test2"))
    }

    fun findOne(request: ServerRequest): Mono<ServerResponse> {
        return ServerResponse.ok().json().bodyValue("Test1")
    }

    fun create(request: ServerRequest): Mono<ServerResponse> {
        return ServerResponse.status(HttpStatus.CREATED).build()
    }
}