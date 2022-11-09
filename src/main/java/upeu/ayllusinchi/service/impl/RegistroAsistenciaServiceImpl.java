/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.ayllusinchi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import upeu.ayllusinchi.entity.RegistroAsistencia;
import upeu.ayllusinchi.repository.RegistroAsistenciaRepository;
import upeu.ayllusinchi.service.RegistroAsistenciaService;

/**
 *
 * @author User
 */
@Service
public class RegistroAsistenciaServiceImpl implements RegistroAsistenciaService{
   
@Autowired
private RegistroAsistenciaRepository registroasistenciaRepository;
    
@Transactional(readOnly = true)
    @Override
 public List<RegistroAsistencia> findAll() {
        
        return (List<RegistroAsistencia>) registroasistenciaRepository .findAll();
    }
    
    @Override
    public RegistroAsistencia findById(Long id) {
        return registroasistenciaRepository.findById(id).orElse(null);
    }

    @Override
    public RegistroAsistencia save(RegistroAsistencia registroasistencia) {
        return registroasistenciaRepository.save(registroasistencia);
    }

    @Override
    public void delete(RegistroAsistencia registroasistencia) {
       registroasistenciaRepository.delete(registroasistencia);
    }

    @Override
    public void deleteById(Long id) {
        registroasistenciaRepository.deleteById(id);
    }
}



 

