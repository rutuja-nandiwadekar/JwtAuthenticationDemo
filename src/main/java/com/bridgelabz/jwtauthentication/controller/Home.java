package com.bridgelabz.jwtauthentication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

        @RequestMapping("/login")
        public String login(){
            String message = "this is private page";
            message += "this page is not allowed to Unauthenticated Users";
            return message ;
        }

}
