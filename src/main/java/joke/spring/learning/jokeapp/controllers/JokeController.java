package joke.spring.learning.jokeapp.controllers;

import joke.spring.learning.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//spring controller

//controller annotation
@Controller
public class JokeController {

    private JokeService jokeService;
//marks a constructor field
    //autowired by string
    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    //maps out context root
    @RequestMapping({"/", ""})
    //append the model with property for joke, spring framework will pass in instance of the model
    public String showJoke(Model model){

        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}