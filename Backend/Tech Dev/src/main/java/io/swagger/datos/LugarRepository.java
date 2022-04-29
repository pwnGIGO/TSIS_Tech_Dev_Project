package io.swagger.datos;

import org.springframework.data.repository.CrudRepository;
import io.swagger.negocio.modelo.Lugar;

public interface LugarRepository extends CrudRepository<Lugar, String>{
    
}
