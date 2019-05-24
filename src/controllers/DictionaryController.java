package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("dic")
    public String application(){
        return "index";
    }
    @PostMapping("dic")
    public String application(String input , Model model) {
        model.addAttribute("input", input);
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Hello", "Xin chào");
        dictionary.put("football", "bóng đá");
        dictionary.put("ball", "quả bong");
        dictionary.put("computer", "máy tính");
        String result = dictionary.get(input);
        if (result != null) {
            model.addAttribute("result",result);
        }else {
            model.addAttribute("result","not result");
        }
        return "index";

    }



}
