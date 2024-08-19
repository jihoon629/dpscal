package com.example.dpscal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

    @Autowired
    private ServiceControll Service;

@GetMapping("/")
public String Select() {
    return "Select";
}


    @PostMapping("/ChangeEq")
    public String Main(@RequestParam("CharaNum") int CharaNum,Model model) {
        List<DtoChrastat> characters = Service.getAllCharacters();

        model.addAttribute("characters", characters.get(CharaNum));
      System.out.println(characters.get(CharaNum));
        return "test";
    }
}
