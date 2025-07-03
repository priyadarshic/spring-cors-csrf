package com.security.cors_config;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CorsController {

//  URL to test CORS configuration => localhost:8080
//  127.0.0.1 and localhost are treated as different domains by the browser
//  open tester.html for url
    @GetMapping("/")
    public String home() {
        return "tester";        // returns tester.html -- Thymeleaf template
    }

    @PostMapping("/test")
    @ResponseBody
    @CrossOrigin
    public String test() {

        return "Welcome to Spring Security: <b> CORS Configuration </b> " +
                "<br>Access Cross Origin URL: http://127.0.0.1:8080/test";
    }

//  URL to test CSRF protection
    @GetMapping("/form")
    public String showForm() {
        return "csrf-form";
    }   // return csrf-form.html

    @PostMapping("/submit")
    public String processForm() {
        return "success";
    }   //return success.html

}
