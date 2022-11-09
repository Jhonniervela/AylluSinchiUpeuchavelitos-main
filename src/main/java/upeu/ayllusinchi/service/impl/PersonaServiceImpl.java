
package upeu.ayllusinchi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import upeu.ayllusinchi.entity.Persona;
import upeu.ayllusinchi.repository.PersonaRepository;
import upeu.ayllusinchi.service.PersonaService;


@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Persona> findAll() {
        return (List<Persona>) personaRepository.findAll();
    }

    @Override
    public Persona findById(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona findByPersDni(String persDni) {
        return personaRepository.findByPersDni(persDni);
    }

    @Override
    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public void delete(Persona persona) {
        personaRepository.delete(persona);
    }

    @Override
    public void deleteById(Long id) {
        personaRepository.deleteById(id);
    }
}
