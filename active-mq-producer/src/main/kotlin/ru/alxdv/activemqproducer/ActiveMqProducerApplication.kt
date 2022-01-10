package ru.alxdv.activemqproducer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ActiveMqProducerApplication

fun main(args: Array<String>) {
    runApplication<ActiveMqProducerApplication>(*args)
}
