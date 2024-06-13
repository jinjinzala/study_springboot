package org.example.heejin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceMeetYou(Model model){
        model.addAttribute("username","김희진");
        // greetings.mustache 파일 반환
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname","김희진");
        // goodbye.mustache 파일 반환
        return "goodbye";
    }


}
