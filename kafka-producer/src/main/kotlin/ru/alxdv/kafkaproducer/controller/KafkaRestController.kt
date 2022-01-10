package ru.alxdv.kafkaproducer.controller

import org.springframework.web.bind.annotation.*
import ru.alxdv.kafkaproducer.model.User
import ru.alxdv.kafkaproducer.service.KafkaProducer

@RestController
@RequestMapping("/kafka")
class KafkaRestController(private val kafkaProducer: KafkaProducer) {

    @PostMapping("/user")
    fun sendUser(@RequestBody user: User){
        kafkaProducer.sendUser(user)
    }

    @PostMapping
    fun sendMessage(@RequestParam message: String){
        kafkaProducer.sendMessage(message)
    }
}