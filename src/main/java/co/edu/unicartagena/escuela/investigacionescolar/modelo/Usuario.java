/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicartagena.escuela.investigacionescolar.modelo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;
import jakarta.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;


/**
 *
 * @author lucho
 */
@Entity
@Table(name = "usuarios")
@Data
public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_Investigador", nullable = false, length = 15)
    private String id_Investigador;
    @NotEmpty
    private String nombre;
    private String apellido;
    private String telefono;
}

