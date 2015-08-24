package com.tasktoys.dropmd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author mikan
 */
@Controller
@RequestMapping("/")
public class HomeController {

    private static final String VIEW = "home";

    @RequestMapping(method = RequestMethod.GET)
    public String home(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
                       Model model) {
        model.addAttribute("name", name);
        model.addAttribute("login", false);
        return VIEW;
    }

    @RequestMapping(method = RequestMethod.POST, params = "logout")
    public String logout() {
        return VIEW;
    }
}
