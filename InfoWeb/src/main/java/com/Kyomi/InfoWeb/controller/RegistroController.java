package com.Kyomi.InfoWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Kyomi.InfoWeb.model.Usuario;
import com.Kyomi.InfoWeb.service.UsuarioService;

@Controller
public class RegistroController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/registro")
    public String mostrarRegistro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    @PostMapping("/registro")
    public String registrarUsuario(@ModelAttribute Usuario usuario,
                                   Model model) {
        try {
            usuarioService.registrar(usuario);
            model.addAttribute("mensaje", "Usuario registrado correctamente");
            return "redirect:/login";
        } catch (Exception e) {
            model.addAttribute("mensaje", "Error al registrar usuario");
        }
        return "redirect:/registro";
    }
}
