package com.sim.autoincrementdockertag

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AutoIncrementDockerTagApplication

fun main(args: Array<String>) {
    runApplication<AutoIncrementDockerTagApplication>(*args)
}
