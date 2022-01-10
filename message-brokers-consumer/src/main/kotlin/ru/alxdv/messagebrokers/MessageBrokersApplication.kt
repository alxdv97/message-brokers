package ru.alxdv.messagebrokers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.jms.annotation.EnableJms

@SpringBootApplication
@EnableJms
class MessageBrokersApplication

fun main(args: Array<String>) {
    runApplication<MessageBrokersApplication>(*args)
}
