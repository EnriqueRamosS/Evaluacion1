
package com.example.EA1_RAMOS.controller;


import com.example.EA1_RAMOS.model.Productos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
    @GetMapping("/form")
    public String showForm(Model model){
        model.addAttribute("user",new Productos());
        return "form";
    }
    @PostMapping("/submit")
    public String submitForm(@ModelAttribute Productos user,Model model){
        model.addAttribute("user", user);
        return "success";
    }
}
