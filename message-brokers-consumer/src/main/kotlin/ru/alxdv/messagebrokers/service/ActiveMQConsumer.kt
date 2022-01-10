package ru.alxdv.messagebrokers.service

import mu.KotlinLogging
import org.springframework.jms.annotation.JmsListener
import org.springframework.stereotype.Service

private val logger = KotlinLogging.logger {}

@Service
class ActiveMQConsumer {

    @JmsListener(destination = "\${custom.active-mq.topic}")
    fun listenActive(message: String){
        logger.warn("Consume from ActiveMQ: $message")
    }
}