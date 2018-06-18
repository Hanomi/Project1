package io.shifu.project1.controller;

import io.shifu.project1.services.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for Welcome page
 */

@Controller
public class WelcomeController {

    @Autowired
    private StoryService storyService;

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome(Model model) {
        //load all story
        model.addAttribute("listStory", storyService.findAll());

        model.addAttribute("title", "Welcome");
        return "welcome";
    }
}
