package io.swagger.datos;

import org.springframework.data.repository.CrudRepository;
import io.swagger.negocio.modelo.Hospedaje;

public interface HospedajeRepository extends CrudRepository<Hospedaje, String>{
    
}
