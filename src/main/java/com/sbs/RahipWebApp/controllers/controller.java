
package com.sbs.RahipWebApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class controller {
    
    @GetMapping("/")
    public String index(){
        return "index.html";
    }
        @GetMapping("/calificanos")
    public String calificanos(){
        return "calificanos.html";
    }
    @GetMapping("/nosotros")
    public String nosotros(){
        return "nosotros.html";
    }
        @GetMapping("/servicios")
    public String servicios(){
        return "servicios.html";
    }
        @GetMapping("/brief")
    public String brief(){
        return "brief.html";
    }
    
      @GetMapping("/contacto")
    public String contacto(){
        return "contacto.html";
    }
}
