/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.ayllusinchi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author User
 */
@Data
@Entity
@Table(name ="RegistroAsis")
public class RegistroAsistencia implements Serializable {
     @Id
@Column(name = "Regis_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long regisId;
 @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Fecha")
    private String fecha;
 @Column(name = "Hora")
    private String hora;
    @Column(name = "Descripcion")
    private String descripcion;
 @Column(name = "Lugar")
    private String Lugar;
    @Column(name = "Direccion")
    private String direccion;
 @Column(name = "Programa")
    private String programa;
   

    
}
