
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
import upeu.ayllusinchi.entity.RegistroAsistencia;
import upeu.ayllusinchi.service.RegistroAsistenciaService;

/**
 *
 * @author User
 */
@RestController
@RequestMapping("/RegistroAsis")
public class RegistroAsistenciaController {
  
@Autowired
    private RegistroAsistenciaService registroasistenciaService;  

@GetMapping("/all")
    public List<RegistroAsistencia> findAll() {
        return registroasistenciaService .findAll();
    }
 @GetMapping("/{id}")
    public ResponseEntity<RegistroAsistencia> findById(@PathVariable Long id) {
  RegistroAsistencia registroasistencia= registroasistenciaService.findById(id);
        return ResponseEntity.ok(registroasistencia);
    }
  @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        registroasistenciaService.deleteById(id);
    }

    @PostMapping("/save")
    public RegistroAsistencia save(@RequestBody RegistroAsistencia registroasistencia) {
        return registroasistenciaService.save(registroasistencia);
    }

    @PutMapping("/update")
    public RegistroAsistencia update(@RequestBody RegistroAsistencia registroasistencia) {
        return registroasistenciaService.save(registroasistencia);
    }
}


 