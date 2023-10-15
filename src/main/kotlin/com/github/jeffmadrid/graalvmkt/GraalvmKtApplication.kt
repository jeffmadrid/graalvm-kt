package com.github.jeffmadrid.graalvmkt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class GraalvmKtApplication

fun main(args: Array<String>) {
	runApplication<GraalvmKtApplication>(*args)
}

@RestController
class BasicController {

	@RequestMapping("/")
	fun home() : String {
		return "Hello World!"
	}
}