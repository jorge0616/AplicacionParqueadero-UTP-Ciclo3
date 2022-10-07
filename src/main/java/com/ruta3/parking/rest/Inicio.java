package com.ruta3.parking.rest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class Inicio{
    
    @GetMapping("/index")
    public String index(){
        
        return "index";
    }

    @RequestMapping("/login")
    public String servicio(Model model){
        
        return "login";
    }

}