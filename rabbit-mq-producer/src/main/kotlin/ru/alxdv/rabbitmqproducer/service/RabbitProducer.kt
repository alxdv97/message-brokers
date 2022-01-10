package ru.alxdv.rabbitmqproducer.service

import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class RabbitProducer(private val rabbitTemplate: RabbitTemplate) {

    @Value("\${custom.rabbit.queue}")
    private lateinit var queue: String

    fun sendMessage(message: String){
        rabbitTemplate.convertAndSend(queue, message)
    }
}