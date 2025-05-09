
package com.sbs.RahipWebApp.usuario;

import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {
    
    
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    @Transactional
    public void registro( String nombre , String mail , String clave1, String clave2){
        Usuario u = new Usuario();
        
        
        u.setActivo(true);
        u.setNombre(nombre);
        u.setPassword(clave1);
        u.setMail(mail);
        
        usuarioRepositorio.save(u);
    
    
    }
    
    
    
    
    
    public List<Usuario> getAll(){
    return usuarioRepositorio.findAll();
    }
    
}
