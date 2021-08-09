package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}

@RestController class Controller {
    @GetMapping("/") fun helloWorld() = helloUser("World")
    @GetMapping("/{user}") fun helloUser(@PathVariable("user") user: String) = "Hello $user!"
}