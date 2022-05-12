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
			hospedajeDto.setDireccion(hospedaje.getDireccion());
			hospedajeDto.setEstacionamiento(hospedaje.getEstacionamiento());
			hospedajeDto.setHabitacion(hospedaje.getHabitacion());
			hospedajeDto.setLatitud(hospedaje.getLatitud());
			hospedajeDto.setLavanderia(hospedaje.getLavanderia());
			hospedajeDto.setLongitud(hospedaje.getLongitud());
			hospedajeDto.setMascotas(hospedaje.getMascota());
			hospedajeDto.setNombre(hospedaje.getNombre());
			hospedajeDto.setPiscina(hospedaje.getPiscina());
			hospedajeDto.setPrecio(hospedaje.getPrecio());
			hospedajeDto.setSitioWeb(hospedaje.getSitioWeb());
			hospedajeDto.setTelefono(hospedaje.getTelefono());
			hospedajeDto.setTipo(hospedaje.getTipo());
			hospedajeDto.setWifi(hospedaje.getWifi());
			hospedajeDtoList.add(hospedajeDto);
		}
		return hospedajeDtoList;
	}

}
