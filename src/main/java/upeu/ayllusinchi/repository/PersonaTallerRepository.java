/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.ayllusinchi.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import upeu.ayllusinchi.entity.PersonaTaller;
import upeu.ayllusinchi.entity.Taller;

/**
 *
 * @author 51950
 */
@Repository
public interface PersonaTallerRepository extends CrudRepository<PersonaTaller, Long> {

    List<PersonaTaller> findByTaller(Taller taller);
}
