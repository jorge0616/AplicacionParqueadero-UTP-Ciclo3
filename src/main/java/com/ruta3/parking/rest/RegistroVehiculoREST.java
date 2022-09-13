package com.ruta3.parking.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruta3.parking.model.RegistroVehiculo;
import com.ruta3.parking.service.RegistroVehiculoService;

@RestController
@RequestMapping ("/vehiculo")
public class RegistroVehiculoREST {
    
    @Autowired
    private RegistroVehiculoService registroVehiculoService;

    @GetMapping()
    public List<RegistroVehiculo> listarVehiculos(){
        return registroVehiculoService.listarVehiculos();
    }

    @PostMapping()
    public RegistroVehiculo guardarVehiculos(@RequestBody RegistroVehiculo vehiculo){
        return registroVehiculoService.guardarVehiculos(vehiculo);
    }
}
