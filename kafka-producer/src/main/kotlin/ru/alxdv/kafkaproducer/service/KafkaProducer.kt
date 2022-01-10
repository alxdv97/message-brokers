package ru.alxdv.kafkaproducer.service

import com.google.gson.Gson
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service
import ru.alxdv.kafkaproducer.model.User

@Service
class KafkaProducer(val kafkaTemplate: KafkaTemplate<String, String>) {

    fun sendMessage(message: String){
        kafkaTemplate.send("kafka-topic", message)
    }

    fun sendUser(user: User){
        val json = Gson().toJson(user)
        kafkaTemplate.send("kafka-topic", json)
    }
}