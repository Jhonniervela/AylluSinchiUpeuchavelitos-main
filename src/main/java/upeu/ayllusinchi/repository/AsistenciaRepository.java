
package upeu.ayllusinchi.repository;

import org.springframework.data.repository.CrudRepository;
import upeu.ayllusinchi.entity.Asistencia;

public interface AsistenciaRepository extends CrudRepository<Asistencia, Long> {

    Asistencia findByPersDni(String persDni);
}
    
