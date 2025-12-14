package com.Kyomi.InfoWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Kyomi.InfoWeb.model.Noticia;
import com.Kyomi.InfoWeb.service.NoticiaService;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/noticia")
public class NoticiaController {

    @Autowired
    private NoticiaService noticiaService;

    @PostMapping("/guardar")
    public String guardarNoticia(@ModelAttribute Noticia noticia,
                                 RedirectAttributes redirectAttributes) {

        try {
            noticiaService.insertarNoticia(noticia);
            redirectAttributes.addFlashAttribute(
                "mensaje",
                "Noticia registrada correctamente"
            );
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute(
                "mensaje",
                "Error al registrar la noticia"
            );
        }

        return "redirect:/noticia";
    }

    @PostMapping("/actualizar")
    public String actualizarNoticia(@ModelAttribute Noticia noticia,
                                    RedirectAttributes redirectAttributes) {

        try {
            noticiaService.actualizarNoticia(noticia);
            redirectAttributes.addFlashAttribute(
                "mensaje",
                "Noticia actualizada correctamente"
            );
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute(
                "mensaje",
                "Error al actualizar la noticia"
            );
        }

        return "redirect:/noticia";
    }

    @GetMapping("/noticias/buscar")
    public String buscarNoticias(@RequestParam String texto, Model model) {

        Integer total = noticiaService.buscarNoticias(texto);
        model.addAttribute("total", total);

        return "resultado-busqueda";
    }

}
