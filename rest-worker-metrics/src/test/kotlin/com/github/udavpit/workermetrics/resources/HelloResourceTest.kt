package com.github.udavpit.workermetrics.resources

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
class HelloResourceTest {

    @Test
    fun testHelloEndpoint() {
        given()
                .`when`().get("/hello")
                .then()
                .statusCode(200)
                .body(`is`("hello there"))
    }
}