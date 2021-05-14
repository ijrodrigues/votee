package br.com.votee.voteemanager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VoteeManagerApplication

fun main(args: Array<String>) {
    runApplication<VoteeManagerApplication>(*args)
}
