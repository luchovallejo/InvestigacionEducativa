/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicartagena.escuela.investigacionescolar.controladores;

import co.edu.unicartagena.escuela.investigacionescolar.dao.IUsuarioCrud;
import co.edu.unicartagena.escuela.investigacionescolar.modelo.Usuario;
import co.edu.unicartagena.escuela.investigacionescolar.servicio.IUsuarioServicio;
import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author lucho
 */
@Controller
@Slf4j
public class controladorInicio {
    @Autowired
    /*IUsuarioCrud crudUsuario;*/
    IUsuarioServicio userServicio;
    @GetMapping("/")
     public String inicio(Model modelo){
         /*List<Usuario> listaUsuarios =(List<Usuario>) crudUsuario.findAll();*/
         List<Usuario> listaUsuarios =(List<Usuario>) userServicio.listarUsuarios();
         modelo.addAttribute("usuarios", listaUsuarios);
        log.info("ejecutando controlador inicio MVC");
        return "index";
    }
     @GetMapping("/agregar")
     public String agregar(Usuario usuario){
         return "modificar";
     }
     
     @GetMapping("/editar/{id_Investigador}")
     public String editar(Usuario usuario, Model modelo){
         log.info("invocando editar");
         usuario= userServicio.buscar(usuario);
         modelo.addAttribute("usuario", usuario);
         return "modificar";
     }
     
     @GetMapping("/eliminar/{id_Investigador}")
     public String eliminar(Usuario usuario, Model modelo){
         userServicio.eliminar(usuario);
         return "redirect:/";
     }
     
     @PostMapping("/guardar")
     public String guardar(@Valid Usuario usuario, Errors errores){
         if(errores.hasErrors()){
             return "modificar";
         }
         userServicio.guardar(usuario);
         return "redirect:/";
     }
}

