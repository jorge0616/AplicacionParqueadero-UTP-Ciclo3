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

import com.ruta3.parking.model.Servicio;
import com.ruta3.parking.service.ServicioService;

@RestController
@RequestMapping("/tiposervicio")
public class ServicioREST {
    
    @Autowired
    private ServicioService servicioService;

    @GetMapping
    public List<Servicio> listarServicios(){
        return servicioService.listarServicios();
    }

    @PostMapping
    public Servicio guardarServicios(@RequestBody Servicio servicio){
        return this.servicioService.guardarServicios(servicio);
    }

    @GetMapping(path = "/{id}")
    public Optional<Servicio> obtenerPorId(@PathVariable(value = "id") Long id){
        return servicioService.obtenerPorId(id);
    }

    /*@GetMapping("/query")
    public List<Servicio> filtrarPorTipoDeServicio(@RequestParam("nombreServicio") String nombreServicio){
        return this.servicioService.filtrarPorTipoDeServicio(nombreServicio);
    }*/

    @DeleteMapping(path = "/{id}")
    public String eliminarServicioPorId(@PathVariable(value = "id") long id){
        boolean ok = this.servicioService.eliminarServicio(id);
        if (ok) {
            return "Se eliminó el servicio " + id;
        } else {
            return "No se pudo eliminar el servicio" + id;
        }
    }

}
