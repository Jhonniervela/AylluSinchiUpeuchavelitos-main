/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.ayllusinchi.service;

import java.util.List;
import upeu.ayllusinchi.entity.TipoDocumento;

/**
 *
 * @author 51950
 */
public interface TipoDocumentoService {

    public List<TipoDocumento> findAll();

    public TipoDocumento findById(Long id);

    public TipoDocumento save(TipoDocumento tipoDocumento);

    public void delete(TipoDocumento tipoDocumento);

    public void deleteById(Long id);
}
