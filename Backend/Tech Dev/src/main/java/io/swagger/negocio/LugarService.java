package io.swagger.negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.datos.LugarRepository;
import io.swagger.model.ComentarioDto;
import io.swagger.model.LugarDto;
import io.swagger.negocio.modelo.Comentario;
import io.swagger.negocio.modelo.Lugar;

@Service
public class LugarService {
	@Autowired
	LugarRepository lugarRepository;
	
	public LugarDto buscarPorId(String id) {
		Optional<Lugar> lugar = lugarRepository.findById(id);
		if (lugar.isPresent()) {
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
			// Recuperamos los comentarios
			for(Comentario comentario:lugar.get().getComentario()) {
				ComentarioDto comentarioDto= new ComentarioDto();
				comentarioDto.setUsuario(comentario.getUsuario());
				comentarioDto.setFecha(comentario.getFecha());
				comentarioDto.setDescripcion(comentario.getDescripcion());
				lugarDto.addComentariosItem(comentarioDto);
			}
			return lugarDto;
		}
		else {
			return null;
		}
	}
	
	public List<LugarDto> recuperarTodo() {
		List <Lugar>lugares = new ArrayList<Lugar>();
		lugares = (List<Lugar>) lugarRepository.findAll();
		List <LugarDto> lugarDtoList = new ArrayList<LugarDto>();
		for(Lugar lugar : lugares) {
			LugarDto lugarDto = new LugarDto();
			lugarDto.setId(lugar.getId());
			lugarDto.setNombre(lugar.getNombre());
			lugarDto.setTipo(lugar.getTipo());
			lugarDto.setDescripcion(lugar.getDescripcion());
			lugarDto.setEstado(lugar.getEstado());
			lugarDto.setMunicipio(lugar.getMunicipio());
			lugarDto.setLatitud(lugar.getLatitud());
			lugarDto.setLongitud(lugar.getLongitud());
			lugarDto.setHorarios(lugar.getHorarios());
			lugarDto.setPrecio(lugar.getPrecio());
			
			// Recuperamos los comentarios
			for(Comentario comentario:lugar.getComentario()) {
				ComentarioDto comentarioDto = new ComentarioDto();
				comentarioDto.setUsuario(comentario.getUsuario());
				comentarioDto.setDescripcion(comentario.getDescripcion());
				comentarioDto.setFecha(comentario.getFecha());
				lugarDto.addComentariosItem(comentarioDto);
			}
			lugarDtoList.add(lugarDto);
		}
		return lugarDtoList;
	}
}
