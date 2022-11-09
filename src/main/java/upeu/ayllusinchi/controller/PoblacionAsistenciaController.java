/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.ayllusinchi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import upeu.ayllusinchi.entity.Asistencia;
import upeu.ayllusinchi.service.AsistenciaService;

/**
 *
 * @author carhu
 */
@RestController
@RequestMapping("/Poblacion")
public class PoblacionAsistenciaController {
     @Autowired
    private AsistenciaService AsistenciaService;

    @GetMapping("/all")
    public List<Asistencia> findAll() {
        return AsistenciaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asistencia> findById(@PathVariable Long id) {
        Asistencia poblacionAsistencia = AsistenciaService.findById(id);
        return ResponseEntity.ok(poblacionAsistencia);
    }
    @GetMapping("/dni/{dni}")
    public ResponseEntity<Asistencia> findByPersDni(@PathVariable String dni) {
        Asistencia poblacionAsistencia = AsistenciaService.findByPersDni(dni);
        return ResponseEntity.ok(poblacionAsistencia);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        AsistenciaService.deleteById(id);
    }

    @PostMapping("/save")
    public Asistencia save(@RequestBody Asistencia poblacionAsistencia) {
        return AsistenciaService.save(poblacionAsistencia);
    }

    @PutMapping("/update")
    public Asistencia update(@RequestBody Asistencia poblacionAsistencia) {
        return AsistenciaService.save(poblacionAsistencia);
    }
}
