package com.heally.springmvclabs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Simple hello world Spring MVC Web App.
 */
@Controller
public class HelloController {

    /**
     * Hello world route.
     * @param text A message parameter, which gets capitalized, and returned to the web requester.
     * @param model Spring model, container of the message.
     * @return The route to hello world page (/hello).
     */
    @GetMapping("/hello")
    public String hello(@RequestParam(name="message", required=false, defaultValue="Hello") String text, Model model) {
        model.addAttribute("message", toUpperCase(text));
        return "hello";
    }

    /**
     * Returns a new String equal to the input aString in all caps.
     * @param aString The input String to make all caps.
     * @return A new String; all caps version of input String.
     */
    static String toUpperCase(String aString) {
        return aString == null ? (null) : (aString.toUpperCase());
    }
}
