package edu.utah.jokes.spring5jokesappv2

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Spring5JokesAppV2Application

fun main(args: Array<String>) {
    runApplication<Spring5JokesAppV2Application>(*args)
}
