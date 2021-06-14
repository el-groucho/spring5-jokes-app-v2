package edu.utah.jokes.spring5jokesappv2.service

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.stereotype.Service

@Service
class RandomJokeService(val chuckNorrisQuotes: ChuckNorrisQuotes) {

    fun getRandomJoke(): String {
        return chuckNorrisQuotes.randomQuote
    }
}
