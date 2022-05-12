package io.swagger.negocio;


import java.util.ArrayList;
import java.util.List;
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
		Comentario comentario = new Comentario();
		Optional<Lugar> lugar = lugarRepository.findById(id);
		
		if (lugar.isPresent()) {
			comentario.setUsuario(comentarioDto.getUsuario());
			comentario.setFecha(comentarioDto.getFecha());
			comentario.setDescripcion(comentarioDto.getDescripcion());
			comentario.setLugar(lugar.get());
			
			// Guardamos en BD
			comentarioRepository.save(comentario);
			
			LugarDto lugarDto = new LugarDto();
			lugarDto.setId(lugar.get().getId());
			lugarDto.setNombre(lugar.get().getNombre());
			lugarDto.setTipo(lugar.get().getTipo());
			lugarDto.setDescripcion(lugar.get().getDescripcion());
			lugarDto.setEstado(lugar.get().getEstado());
			lugarDto.setMunicipio(lugar.get().getMunicipio());
			lugarDto.setLatitud(lugar.get().getLatitud());
			lugarDto.setLongitud(lugar.get().getLongitud());
			lugarDto.setHorarios(lugar.get().getHorarios());
			lugarDto.setPrecio(lugar.get().getPrecio());
			lugarDto.addComentariosItem(comentarioDto);
			return lugarDto;
		}
		else {
			return null;
		}
	}
}
