package ru.alxdv.messagebrokers.service

import mu.KotlinLogging
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Service

private val logger = KotlinLogging.logger {}

@Service
class RabbitMQConsumer {

    @RabbitListener(queues = ["\${custom.rabbit.queue}"])
    fun listenRabbit(message: String) {
        logger.warn("Consume from RabbitMQ: $message")
    }
}