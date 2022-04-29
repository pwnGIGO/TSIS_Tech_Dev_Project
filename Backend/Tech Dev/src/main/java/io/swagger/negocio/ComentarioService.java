package io.swagger.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.model.ComentarioDto;
import io.swagger.datos.ComentarioRepository;
import io.swagger.negocio.modelo.Comentario;

@Service
public class ComentarioService {
    
    @Autowired
    ComentarioRepository comentarioRepository;

    public ComentarioDto create(ComentarioDto comentarioDto) {

        Comentario c = Comentario.builder()
                .nombre(comentarioDto.getUsuario())
                .fecha(comentarioDto.getFecha())
                .descripcion(comentarioDto.getDescripcion())
                .build();

        //Validamos reglas de negocio
        
        // Persistimos el producto
        c = comentarioRepository.save(c);
                
        ComentarioDto dto = ComentarioDto.builder()
                .usuario(c.getNombre())
                .fecha(c.getFecha())
                .descripcion(c.getDescripcion())
                .build();
                
        return dto;
    }
}
