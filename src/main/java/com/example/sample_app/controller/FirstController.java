package com.example.sample_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/greetings")

    public String NiceToMeetYou(Model model) {
        model.addAttribute("username", "Kihyun");
        return "greetings"; // 템플릿 밑에 머스테치를 찾아 실행
    }

    @GetMapping("/bye")
    public String SeeYouNext(Model model) {
        model.addAttribute("nickname", "기빵");
        return "goodbye";
    }
}
