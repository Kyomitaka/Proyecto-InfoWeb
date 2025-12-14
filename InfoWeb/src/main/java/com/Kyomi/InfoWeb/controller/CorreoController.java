package com.Kyomi.InfoWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Kyomi.InfoWeb.service.CorreoService;

@Controller
public class CorreoController {

    @Autowired
    private CorreoService noticiaCorreoService;

    @PostMapping("/noticia/enviar-correo")
    public String registrarEnvioCorreo(@RequestParam Long idNoticia) {

        noticiaCorreoService.registrarEnvioCorreo(idNoticia);

        return "redirect:/noticias";
    }
}
