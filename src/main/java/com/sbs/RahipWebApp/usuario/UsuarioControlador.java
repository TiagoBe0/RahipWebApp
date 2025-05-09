
package com.sbs.RahipWebApp.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioControlador {
    
    @Autowired
    private UsuarioServicio usuarioServicio;
    
    
    @GetMapping("/registro")
    public String registrar(){
    
    return "registroUsuario.html";
    }
    
    
    
    @PostMapping("/registro")
    public String registro(String nombre , String mail , String clave1 , String clave2,String id){
        
        usuarioServicio.registro(id, nombre, mail, clave1, clave2);
    
    return "index.html";
    }
    
}
