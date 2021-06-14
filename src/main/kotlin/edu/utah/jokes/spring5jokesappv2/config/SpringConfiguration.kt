package edu.utah.jokes.spring5jokesappv2.config

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SpringConfiguration {
    @Bean
    fun chuckNorrisQuotes(): ChuckNorrisQuotes {
        return ChuckNorrisQuotes()
    }
}
