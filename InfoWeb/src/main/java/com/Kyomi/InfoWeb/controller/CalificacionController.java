package com.Kyomi.InfoWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.Kyomi.InfoWeb.service.CalificacionService;

@Controller
@RequestMapping("/calificacion")
public class CalificacionController {

    @Autowired
    private CalificacionService calificacionService;

    @PostMapping("/registrar")
    public String registrarCalificacion(
            @RequestParam Long idUsuario,
            @RequestParam Long idNoticia,
            @RequestParam Integer puntaje) {

        calificacionService.registrarCalificacion(idUsuario, idNoticia, puntaje);
        return "redirect:/noticias";
    }

    @GetMapping("/promedio/{idNoticia}")
    @ResponseBody
    public Double obtenerPromedio(@PathVariable Long idNoticia) {
        return calificacionService.obtenerPromedio(idNoticia);
    }
}
