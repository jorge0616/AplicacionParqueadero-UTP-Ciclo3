package com.ruta3.parking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruta3.parking.model.Servicio;
import com.ruta3.parking.repository.ServicioRepository;


@Service
public class ServicioService {
    
    @Autowired
    private ServicioRepository servicioRepository;

    public List<Servicio> listarServicios(){
        return  (List<Servicio>) servicioRepository.findAll();
    }

    public Servicio guardarServicios(Servicio servicio){
        return servicioRepository.save(servicio);
    }

    public Optional<Servicio> obtenerPorId(Long id){
        return servicioRepository.findById(id);
    }

    public boolean eliminarServicio(Long id){
        try {
            servicioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
