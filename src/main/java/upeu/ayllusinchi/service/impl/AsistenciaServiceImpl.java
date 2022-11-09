
package upeu.ayllusinchi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import upeu.ayllusinchi.entity.Asistencia;
import upeu.ayllusinchi.repository.AsistenciaRepository;
import upeu.ayllusinchi.service.AsistenciaService;

@Service
public class AsistenciaServiceImpl implements AsistenciaService{
    
    @Autowired
    private AsistenciaRepository asistenciaRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Asistencia> findAll() {
        return (List<Asistencia>) asistenciaRepository.findAll();
    }
    @Override
    public Asistencia findById(Long id) {
        return asistenciaRepository.findById(id).orElse(null);
    }

    @Override
    public Asistencia findByPersDni(String persDni) {
        return asistenciaRepository.findByPersDni(persDni);
    }

    @Override
    public Asistencia save(Asistencia poblacionAsistencia) {
        return asistenciaRepository.save(poblacionAsistencia);
    }

    @Override
    public void delete(Asistencia poblacionAsistencia) {
        asistenciaRepository.delete(poblacionAsistencia);
    }

    @Override
    public void deleteById(Long id) {
        asistenciaRepository.deleteById(id);
    }

}
