package ru.alxdv.messagebrokers.service

import mu.KotlinLogging
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

private val logger = KotlinLogging.logger {}

@Service
class KafkaConsumer {

    @KafkaListener(topics = ["kafka-topic"], groupId = "\${spring.kafka.consumer.group-id}")
    fun listenKafka(message: String){
        logger.warn("Consume from Kafka: $message")
    }
}