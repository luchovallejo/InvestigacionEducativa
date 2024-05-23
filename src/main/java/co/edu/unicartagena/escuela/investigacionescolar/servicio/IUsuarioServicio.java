/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicartagena.escuela.investigacionescolar.servicio;

import co.edu.unicartagena.escuela.investigacionescolar.modelo.Usuario;
import java.util.List;

/**
 *
 * @author lucho
 */

public interface IUsuarioServicio {
    public List<Usuario> listarUsuarios();
    public void guardar (Usuario user);
    public void eliminar (Usuario user);
    public Usuario buscar (Usuario user);
}
