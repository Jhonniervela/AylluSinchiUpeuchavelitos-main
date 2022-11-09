/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.ayllusinchi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import upeu.ayllusinchi.entity.TipoDocumento;
import upeu.ayllusinchi.repository.TipoDocumentoRepository;
import upeu.ayllusinchi.service.TipoDocumentoService;

/**
 *
 * @author 51950
 */
@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoService {

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @Transactional(readOnly = true)
    @Override
    public List<TipoDocumento> findAll() {
        return (List<TipoDocumento>) tipoDocumentoRepository.findAll();
    }

    @Override
    public TipoDocumento findById(Long id) {
        return tipoDocumentoRepository.findById(id).orElse(null);
    }

    @Override
    public TipoDocumento save(TipoDocumento tipoDocumento) {
        return tipoDocumentoRepository.save(tipoDocumento);
    }

    @Override
    public void delete(TipoDocumento tipoDocumento) {
        tipoDocumentoRepository.delete(tipoDocumento);
    }

    @Override
    public void deleteById(Long id) {
        tipoDocumentoRepository.deleteById(id);
    }
}
