/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.ayllusinchi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author 51950
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @GetMapping("/persona")
    public String indexPersona(Model model) {
        model.addAttribute("mensaje", "Personas");
        return "personas/persona";
    }

    @GetMapping("/programa")
    public String indexPrograma(Model model) {
        model.addAttribute("mensaje", "Programas");
        return "programas/programa";
    }

    @GetMapping("/taller")
    public String indexTaller(Model model) {
        model.addAttribute("mensaje", "Talleres");
        return "talleres/talleres";
    }

    @GetMapping("/tipo-persona")
    public String indexTipoPersona(Model model) {
        model.addAttribute("mensaje", "Tipos Persona");
        return "tipoPersona/tipoPersona";
    }
    
    @GetMapping("/persona-taller")
    public String indexPersonaTaller(Model model){
        model.addAttribute("mensaje", "Enlace de persona y taller");
        return "personaTaller/personaTaller";
}
 @GetMapping("/poblacionAsistencia")
    public String indexPoblacionAsistencia(Model model){
        model.addAttribute("mensaje", "Asistencia");
        return "poblacionAsistencia/poblacionAsistencia";
    }
}
