
package com.sbs.RahipWebApp.controllers;

import com.sbs.RahipWebApp.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    
    @GetMapping("/registro")
    public String registrar(){
    
    return "contacto.html";
    }
    
    
    @GetMapping("/tabla")
    public String tabla(ModelMap modelo){
        
        
        modelo.put("clientes",clienteService.getAll());
    
    return "tablaCliente.html";
    }
    
    @PostMapping("/registro")
    public String registro(String nombreEmpresa , String nombreCliente , String celular , String resumen , String objetivos){
    
        clienteService.registro(nombreEmpresa, nombreCliente, celular, resumen, objetivos);
    return "index.html";
    }
    
}
