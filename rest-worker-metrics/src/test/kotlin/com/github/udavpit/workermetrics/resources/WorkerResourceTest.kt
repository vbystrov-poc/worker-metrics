package com.github.udavpit.workermetrics.resources

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
open class WorkerResourceTest {

    @Test
    fun testHelloEndpoint() {
        given()
          .`when`().get("/api/workers")
          .then()
             .statusCode(200)
             .body(`is`("hello"))
    }

}