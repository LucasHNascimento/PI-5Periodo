package com.salao.agendamentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String redirecionarParaHome() {
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String mostrarHome() {
        return "home";
    }
}
