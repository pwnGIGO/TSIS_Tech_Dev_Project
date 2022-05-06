package io.swagger.negocio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.datos.ComentarioRepository;
import io.swagger.datos.LugarRepository;
import io.swagger.model.ComentarioDto;
import io.swagger.model.LugarDto;
import io.swagger.negocio.modelo.Comentario;
import io.swagger.negocio.modelo.Lugar;

@Service
public class ComentarioService {
	@Autowired
	ComentarioRepository comentarioRepository;
	@Autowired
	LugarRepository lugarRepository;
	
	public  LugarDto agregarComentario(ComentarioDto comentarioDto, String id) {
		int i;
		Long idComentario=Long.parseLong(id);
		Comentario comentario = null;
		Optional<Lugar> lugar = null;
		lugar= lugarRepository.findById(idComentario);
		
		comentario.setUsuario(comentarioDto.getUsuario());
		comentario.setFecha(comentarioDto.getFecha());
		comentario.setDescripcion(comentarioDto.getDescripcion());
		comentario.setLugar(lugar.get());

	
		//Guardamos en BD
		comentarioRepository.save(comentario);
		LugarDto lugarDto = null;
		lugarDto.descripcion(lugar.get().getDescripcion());
		
		return lugarDto;
	}

}
