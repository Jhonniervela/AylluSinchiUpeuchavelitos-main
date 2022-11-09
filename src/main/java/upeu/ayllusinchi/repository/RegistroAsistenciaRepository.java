

package upeu.ayllusinchi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import upeu.ayllusinchi.entity.RegistroAsistencia;

/**
 *
 * @author User
 */
@Repository
public interface RegistroAsistenciaRepository extends CrudRepository<RegistroAsistencia, Long>{
  
  
}
