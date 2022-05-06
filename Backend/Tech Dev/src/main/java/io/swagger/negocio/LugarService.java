package io.swagger.negocio;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.datos.LugarRepository;
import io.swagger.model.LugarDto;
import io.swagger.negocio.modelo.Lugar;

@Service
public class LugarService {
	@Autowired
	LugarRepository lugarRepository;
	
	public LugarDto buscarPorId(String id) {
		Long idLugar = Long.parseLong(id);
		Optional<Lugar> lugar = null;
		lugar= lugarRepository.findById(idLugar);
		if (lugar.isPresent()) {
			LugarDto lugarDto = null;
			lugarDto.setNombre(lugar.get().getNombre());
			lugarDto.setTipo(lugar.get().getTipo());
			lugarDto.setDescripcion(lugar.get().getDescripcion());
			lugarDto.setEstado(lugar.get().getEstado());
			lugarDto.setMunicipio(lugar.get().getMunicipio());
			lugarDto.setLatitud(lugar.get().getLatitud());
			lugarDto.setLongitud(lugar.get().getLongitud());
			lugarDto.setHorarios(lugar.get().getHorarios());
			lugarDto.setPrecio(lugar.get().getPrecio());
			List comentarios  = lugar.get().getComentario();
			lugarDto.setComentarios(comentarios);
			return lugarDto;
		}
		return null;
	}
}
