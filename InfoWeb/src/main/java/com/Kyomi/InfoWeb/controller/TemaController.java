package com.Kyomi.InfoWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Kyomi.InfoWeb.model.Tema;
import com.Kyomi.InfoWeb.service.TemaService;

@Controller
public class TemaController {

    @Autowired
    private TemaService temaService;

    @GetMapping("/tema")
    public String mostrarFormulario(Model model) {
        model.addAttribute("tema", new Tema());
        return "tema";
    }

    @PostMapping("/tema")
    public String registrarTema(@ModelAttribute Tema tema,
                                RedirectAttributes redirectAttributes) {

        try {
            temaService.registrarTema(tema);
            redirectAttributes.addFlashAttribute(
                "mensaje",
                "Tema registrado correctamente"
            );
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute(
                "mensaje",
                "Error al registrar el tema"
            );
        }

        return "redirect:/tema";
    }

    @PostMapping("/actualizar")
    public String actualizarTema(@ModelAttribute Tema tema,
                                 RedirectAttributes redirectAttributes) {

        try {
            temaService.actualizarTema(tema);
            redirectAttributes.addFlashAttribute(
                "mensaje",
                "Tema actualizado correctamente"
            );
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute(
                "mensaje",
                "Error al actualizar el tema"
            );
        }

        return "redirect:/tema";
    }
}
