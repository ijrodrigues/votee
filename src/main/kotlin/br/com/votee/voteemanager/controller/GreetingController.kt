package br.com.votee.voteemanager.controller

import br.com.votee.voteemanager.domain.Greet
import br.com.votee.voteemanager.repository.GreetRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class GreetingController(private val greetRepository: GreetRepository) {

    @GetMapping("/hello/{name}")
    fun greet(@PathVariable name : String): Greet {
        val greet = Greet(message = "hello $name")
        return greetRepository.save(greet)
    }
}