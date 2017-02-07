package com.keepsurprisingyourself.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by steve on 22/12/16.
 */
@Controller
public class PageControllers {

    @RequestMapping("/")
    public String getHomePageMAV() {
        return "home";
    }

    @RequestMapping("/about")
    public String getAboutPageMAV() {
        return "about";
    }

    @RequestMapping("/projects")
    public String getProjectsPageMAV() {
        return "projects";
    }

}
