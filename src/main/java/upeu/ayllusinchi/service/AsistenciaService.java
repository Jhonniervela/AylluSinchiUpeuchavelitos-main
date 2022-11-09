
package upeu.ayllusinchi.service;

import java.util.List;
import upeu.ayllusinchi.entity.Asistencia;

public interface AsistenciaService {
    public List<Asistencia> findAll();

    public Asistencia findById(Long id);

    public Asistencia findByPersDni(String persDni);

    public Asistencia save(Asistencia poblacionAsistencia);

    public void delete(Asistencia poblacionAsistencia);

    public void deleteById(Long id);
}
