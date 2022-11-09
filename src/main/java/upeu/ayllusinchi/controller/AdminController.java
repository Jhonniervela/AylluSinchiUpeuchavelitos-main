/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.ayllusinchi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author USUARIO
 */

@Controller
public class AdminController {
    @GetMapping("/admin")
    public String indexAdmin(Model model){
        model.addAttribute("mensaje", "Talleres");
        return "admin/admin";
    }
    
}
