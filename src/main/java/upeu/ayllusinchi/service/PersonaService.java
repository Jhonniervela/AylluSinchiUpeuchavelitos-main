
package upeu.ayllusinchi.service;

import java.util.List;
import upeu.ayllusinchi.entity.Persona;

public interface PersonaService {

    public List<Persona> findAll();

    public Persona findById(Long id);

    public Persona findByPersDni(String persDni);

    public Persona save(Persona persona);

    public void delete(Persona persona);

    public void deleteById(Long id);
}
