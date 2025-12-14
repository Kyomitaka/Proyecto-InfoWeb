package com.Kyomi.InfoWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Kyomi.InfoWeb.dto.LoginDTO;
import com.Kyomi.InfoWeb.service.UsuarioService;

@Controller
public class LoginController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String mostrarLogin(Model model) {
        model.addAttribute("loginData", new LoginDTO());
        return "login"; 
    }

    @PostMapping("/login")
    public String procesarLogin(
            @ModelAttribute("loginData") LoginDTO loginRequest, 
            RedirectAttributes redirectAttributes) {

        LoginDTO loginResult = usuarioService.login(
            loginRequest.getUsername(),
            loginRequest.getContrasena()
        );

        if ("EXITO".equals(loginResult.getResultado())) {
            redirectAttributes.addFlashAttribute("idUsuario", loginResult.getIdUsuario());
            redirectAttributes.addFlashAttribute("idRol", loginResult.getIdRol());
            
            return "inicio.html"; 
            
        } else {
            String mensajeError = "Error de login: ";
            
            switch (loginResult.getResultado()) {
                case "USUARIO_NO_EXISTE":
                    mensajeError += "El nombre de usuario no existe.";
                    break;
                case "CONTRASENA_INCORRECTA":
                    mensajeError += "Contraseña incorrecta.";
                    break;
                case "PASSWORD_NULA":
                    mensajeError += "Error interno: Contraseña nula en BD.";
                    break;
                default:
                    mensajeError += "Error desconocido.";
                    break;
            }
            
            redirectAttributes.addFlashAttribute("error", mensajeError);
            return "login"; 
        }
    }
}