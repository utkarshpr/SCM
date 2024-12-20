package com.scm.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.scm.entities.User;
import com.scm.helper.Helper;
import com.scm.services.UserService;

@ControllerAdvice
public class RootController {

     private Logger logger = LoggerFactory.getLogger(RootController.class);
    // user dashbaord page

    @Autowired
    private UserService userService;

      @ModelAttribute
    public void addLoggedInUserInformation(Model model, Authentication authentication) {
        if (authentication == null) {
            return;
        }
        logger.info("Adding logged in info to the user......");
        String name = Helper.getEmailOfLoggedInUser(authentication);
        User user = userService.getUserByEmail(name);
       
        logger.info("user logged in " + user);
        model.addAttribute("user", user);
        
    }

}
