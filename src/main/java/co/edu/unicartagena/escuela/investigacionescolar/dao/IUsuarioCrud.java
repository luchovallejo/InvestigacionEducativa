/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicartagena.escuela.investigacionescolar.dao;

import co.edu.unicartagena.escuela.investigacionescolar.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author lucho
*/ 
public interface IUsuarioCrud extends CrudRepository<Usuario, String>{
 
   
}
