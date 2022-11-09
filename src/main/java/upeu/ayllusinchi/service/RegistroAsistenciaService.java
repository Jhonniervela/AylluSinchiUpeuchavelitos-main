
package upeu.ayllusinchi.service;

import java.util.List;
import upeu.ayllusinchi.entity.RegistroAsistencia;

/**
 *
 * @author User
 */
public interface RegistroAsistenciaService {

      public List <RegistroAsistencia> findAll();

      public RegistroAsistencia findById(Long id);

      public RegistroAsistencia save(RegistroAsistencia registroasistencia);

      public void delete (RegistroAsistencia registroasistencia);

     public void  deleteById(Long id);

}