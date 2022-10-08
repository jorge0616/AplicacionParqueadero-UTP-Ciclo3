package com.ruta3.parking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruta3.parking.model.RegistroVehiculo;
import com.ruta3.parking.repository.RegistroVehiculoRepository;

@Service
public class RegistroVehiculoService {
    
    @Autowired
    private RegistroVehiculoRepository registroVehiculoRepository;
    
    public List<RegistroVehiculo> listarVehiculos(){
        return (List<RegistroVehiculo>) registroVehiculoRepository.findAll();
    }

    public RegistroVehiculo guardarVehiculos(RegistroVehiculo vehiculo){
        return registroVehiculoRepository.save(vehiculo);
    }

    public Optional<RegistroVehiculo> obtenerPorIdVehiculo(Long id){
        return registroVehiculoRepository.findById(id);
    }

    public boolean eliminarVehiculo(Long id){
        try {
            registroVehiculoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
    
    


