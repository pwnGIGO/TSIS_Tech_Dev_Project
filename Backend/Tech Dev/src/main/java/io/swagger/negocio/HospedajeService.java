package io.swagger.negocio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.datos.HospedajeRepository;
import io.swagger.model.HospedajeDto;
import io.swagger.negocio.modelo.Hospedaje;

@Service
public class HospedajeService {
	
	@Autowired
	HospedajeRepository hospedajeRepository;
	
	public List<HospedajeDto> recuperaTodo(){
		List<Hospedaje> hospedajeList = new ArrayList<Hospedaje>();
		hospedajeList = (List<Hospedaje>) hospedajeRepository.findAll();
		List<HospedajeDto> hospedajeDtoList = new ArrayList<HospedajeDto>();
		for(Hospedaje hospedaje : hospedajeList) {
			HospedajeDto hospedajeDto = new HospedajeDto();
			hospedajeDto.setDescripcion(hospedaje.getDescripcion());
			hospedajeDto.setFoto(hospedaje.getFoto());
			hospedajeDto.setLatitud(hospedaje.getLatitud());
			hospedajeDto.setLongitud(hospedaje.getLongitud());
			hospedajeDto.setNombre(hospedaje.getNombre());
			hospedajeDto.setPrecio(hospedaje.getPrecio());
			hospedajeDto.setTelefono(hospedaje.getTelefono());
			hospedajeDtoList.add(hospedajeDto);
		}
		return hospedajeDtoList;
	}

}
