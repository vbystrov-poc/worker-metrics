package com.github.udavpit.workermetrics

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * MetricsApplication
 *
 * @author Vladimir Bystrov
 */
@SpringBootApplication
class MetricsApplication

fun main(args: Array<String>) {
    runApplication<MetricsApplication>(*args)
}