package io.swagger.datos;

import org.springframework.data.repository.CrudRepository;

import io.swagger.negocio.modelo.Comentario;

public interface ComentarioRepository extends CrudRepository<Comentario, Long>{

}
