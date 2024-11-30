package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class PageController {
    
    @RequestMapping("/")
    public String HomeDefault(Model model){
        System.out.println("Home Page Handler");
        // sending data to view 
        model.addAttribute("name", "Substring Tech");
        return "home";
    }

    @RequestMapping("/home")
    public String Home(Model model){
        System.out.println("Home Page Handler");
        // sending data to view 
        model.addAttribute("name", "Substring Tech");
        return "home";
    }

    @RequestMapping("/about")
    public String About() {
        System.out.println("About");
        return "about";
    }


    @RequestMapping("/services")
    public String Services() {
        System.out.println("service");
        return "service";
    }
    
    @RequestMapping("/login")
    public String Login() {
        System.out.println("service");
        return "login";
    }
    @RequestMapping("/signup")
    public String Signup() {
        System.out.println("service");
        return "signup";
    }
    @RequestMapping("/contact")
    public String Contact() {
        System.out.println("service");
        return "contact";
    }
}
