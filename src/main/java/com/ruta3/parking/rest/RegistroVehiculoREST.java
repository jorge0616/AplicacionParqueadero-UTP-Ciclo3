package com.ruta3.parking.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(path = "/{id}")
    public Optional<RegistroVehiculo> obtenerPorIdVihiculo(@PathVariable(value = "id") Long id){
        return registroVehiculoService.obtenerPorIdVehiculo(id);
    }


    @DeleteMapping(path = "/{id}")
    public String eliminarServicioPorId(@PathVariable(value = "id") long id){
        boolean ok = this.registroVehiculoService.eliminarVehiculo(id);
        if (ok) {
            return "Se eliminó el vehículo con id: " + id;
        } else {
            return "No se pudo eliminar el vehículo: " + id;
        }
    }
}
