/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicartagena.escuela.investigacionescolar.servicio;

import co.edu.unicartagena.escuela.investigacionescolar.dao.IUsuarioCrud;
import co.edu.unicartagena.escuela.investigacionescolar.modelo.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author lucho
 */

@Service
public class UsuarioServicioImp implements IUsuarioServicio{
    @Autowired
    IUsuarioCrud crudUser;
    
    @Transactional(readOnly = true)

    @Override
    public List<Usuario> listarUsuarios() {
        return(List<Usuario>)crudUser.findAll();
    }

    @Override
    public void guardar(Usuario user) {
        crudUser.save(user);
    }

    @Override
    public void eliminar(Usuario user) {
        crudUser.delete(user);
    }

    @Override
    public Usuario buscar(Usuario user) {
        return crudUser.findById(user.getId_Investigador()).orElse(null);
    }
}

