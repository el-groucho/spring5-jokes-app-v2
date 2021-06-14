package edu.utah.jokes.spring5jokesappv2.controller

import edu.utah.jokes.spring5jokesappv2.service.RandomJokeService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class RandomJokeController(val randomJokeService: RandomJokeService) {
    @RequestMapping("/", "")
    fun showJoke(model: Model): String {
        model.addAttribute("joke", randomJokeService.getRandomJoke())
        return "index"
    }
}
