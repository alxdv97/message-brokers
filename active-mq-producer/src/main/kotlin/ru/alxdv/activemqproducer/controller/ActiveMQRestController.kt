package ru.alxdv.activemqproducer.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.alxdv.activemqproducer.service.ActiveMQProducer

@RestController
@RequestMapping("/jms")
class ActiveMQRestController(private val activeMQProducer: ActiveMQProducer) {

    @PostMapping
    fun sendMessage(@RequestParam message: String){
        activeMQProducer.sendMessage(message)
    }
}