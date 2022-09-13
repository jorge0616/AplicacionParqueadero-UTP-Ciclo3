package com.ruta3.parking.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ruta3.parking.model.Servicio;

@Repository
public interface ServicioRepository extends CrudRepository<Servicio, Long> {
    
    //public abstract List<Servicio> filtarPorTipoDeServicio(String nombreServicio);

}


