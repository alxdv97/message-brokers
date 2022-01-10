package ru.alxdv.activemqproducer.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.jms.core.JmsTemplate
import org.springframework.stereotype.Service

@Service
class ActiveMQProducer(private val jmsTemplate: JmsTemplate) {

    @Value("\${custom.active-mq.topic}")
    private lateinit var topic: String

    fun sendMessage(message: String){
        jmsTemplate.convertAndSend(topic, message)
    }
}