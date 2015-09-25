package net.nixj.epm.controllers;

import net.nixj.epm.repos.MockCrewRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by fantsay on 9/24/15.
 */

@Controller
public class FrontController {
    @RequestMapping (value = "/index.html")
    public String index(Model model)
    {
        model.addAttribute("crew", new MockCrewRepo().getCrew().getName());
        return "index";
    }

    @RequestMapping(value = "/")
    public String login(Model model)
    {
    model.addAttribute("crew", "Timoha");
        return "index";

    }
    @RequestMapping (value = "/profile")
    public String loadProfile(Model model)

    {

        model.addAttribute("crew", new MockCrewRepo().getCrew().getName());
        return "profile";
    }

    @RequestMapping (value = "/login.html")
    public String login()
    {
    return "login";
    }

    @RequestMapping("/error.html")
    public String loginError(Model model) {
        return "error";
    }
}


