package com.Kyomi.InfoWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Kyomi.InfoWeb.model.Subtema;
import com.Kyomi.InfoWeb.service.SubtemaService;

@Controller
@RequestMapping("/subtema")
public class SubtemaController {

    @Autowired
    private SubtemaService subtemaService;

    @PostMapping("/guardar")
    public String guardarSubtema(@ModelAttribute Subtema subtema,
                                 RedirectAttributes redirectAttributes) {

        try {
            subtemaService.insertarSubtema(subtema);
            redirectAttributes.addFlashAttribute(
                "mensaje",
                "Subtema registrado correctamente"
            );
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute(
                "mensaje",
                "Error al registrar el subtema"
            );
        }

        return "redirect:/subtema";
    }

    @PostMapping("/actualizar")
    public String actualizarSubtema(@ModelAttribute Subtema subtema,
                                    RedirectAttributes redirectAttributes) {

        try {
            subtemaService.actualizarSubtema(subtema);
            redirectAttributes.addFlashAttribute(
                "mensaje",
                "Subtema actualizado correctamente"
            );
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute(
                "mensaje",
                "Error al actualizar el subtema"
            );
        }

        return "redirect:/subtema";
    }
}
