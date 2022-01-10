package ru.alxdv.rabbitmqproducer.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.alxdv.rabbitmqproducer.service.RabbitProducer

@RestController
@RequestMapping("/rabbit")
class RabbitRestController(private val rabbitProducer: RabbitProducer) {

    @PostMapping
    fun sendMessage(@RequestParam message: String){
        rabbitProducer.sendMessage(message)
    }
}