package com.ruta3.parking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ruta3.parking.model.RegistroVehiculo;

@Repository
public interface RegistroVehiculoRepository extends CrudRepository<RegistroVehiculo, Long>  {
    
}
