package ru.alxdv.rabbitmqproducer.config

import org.springframework.amqp.core.Queue
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RabbitQueueConfig {

    @Value("\${custom.rabbit.queue}")
    private lateinit var queue: String

    @Bean
    fun rabbitQueue(): Queue? {
            return Queue(queue, false)
    }
}