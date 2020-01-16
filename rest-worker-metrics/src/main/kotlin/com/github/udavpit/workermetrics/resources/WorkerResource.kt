package com.github.udavpit.workermetrics.resources

import com.github.udavpit.workermetrics.entities.Worker
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/workers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
class WorkerResource {

    @GET
    fun findAll(): Response {
        val workers = listOf(Worker("worker1", "localhost", 9091))
        return Response.ok(workers).build()
    }
}