package com.scm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scm.entities.Providers;
import com.scm.entities.User;
import com.scm.services.UserService;

import forms.UserForm;





@Controller
public class PageController {

     @Autowired
    private UserService userService;

    
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
    public String Signup(Model model) {
        UserForm userForm=new UserForm();
        // userForm.setName("utkarsh");
        // userForm.setAbout("gsdgsgsgs");
        model.addAttribute("userForm", userForm);

        return "signup";
    }
    @RequestMapping("/contact")
    public String Contact() {
        System.out.println("service");
        return "contact";
    }

    //processing register
    @RequestMapping(value = "/do-register", method=RequestMethod.POST)
    public String processRegister(@ModelAttribute UserForm userForm){
        System.out.println("Processing registration");
        // fetch the Data from Form 
       // System.out.println(userForm.toString());
       User user = User.builder()
                .name(userForm.getName())
                .email(userForm.getEmail())
                .password(userForm.getPassword())
                .about(userForm.getAbout())
                .phoneNumber(userForm.getPhoneNumber())
                .profilePic(
                        "https://www.learncodewithdurgesh.com/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fdurgesh_sir.35c6cb78.webp&w=1920&q=75")
                .build(); 
                
                if (user.getProvider() == null) {
                    user.setProvider(Providers.SELF);
                }
                User savedUser = userService.saveUser(user);

                System.out.println("user saved :"+ savedUser.toString());
        return "redirect:/signup";
    }
}
