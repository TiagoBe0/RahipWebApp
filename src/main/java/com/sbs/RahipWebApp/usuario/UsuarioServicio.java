
package com.sbs.RahipWebApp.usuario;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {
    
    
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    @Transactional
    public void registro(String id , String nombre , String mail , String clave1, String clave2){
        Usuario u = new Usuario();
        
        
        u.setActivo(true);
        u.setId(id);
        u.setNombre(nombre);
        u.setPassword(clave1);
        u.setMail(mail);
        
        usuarioRepositorio.save(u);
    
    
    }
    
}
