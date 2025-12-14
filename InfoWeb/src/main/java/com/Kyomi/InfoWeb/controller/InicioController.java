package com.Kyomi.InfoWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class InicioController {

    @GetMapping("/inicio") 
    public String mostrarInicio(
        Model model, 
        @ModelAttribute("idUsuario") Long idUsuario, 
        @ModelAttribute("idRol") Long idRol) {
        
        model.addAttribute("idUsuario", idUsuario);
        model.addAttribute("idRol", idRol);

        return "inicio"; 
    }
}