package com.github.udavpit.workermetrics.entities

import io.quarkus.hibernate.orm.panache.PanacheEntity
import javax.persistence.Entity

@Entity
data class Worker(val name: String, val host: String, val port: Int) : PanacheEntity()