
package com.sbs.RahipWebApp.service;

import com.sbs.RahipWebApp.entity.Cliente;
import com.sbs.RahipWebApp.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;
   @Transactional 
    public void registro(String nombreEmpresa,String nombreCliente,String celular,String resumen , String objetivos){
        Cliente c = new Cliente();
        c.setCelular(celular);
        c.setNombreCliente(nombreCliente);
        c.setNombreEmpresa(nombreEmpresa);
        c.setObjetivos(objetivos);
        c.setResumen(resumen);
        
        
        clienteRepository.save(c);
        
        
        
                
        
    
    
    }
    
    
    
    public List<Cliente> getAll(){
    return clienteRepository.findAll();
    }
    
}
