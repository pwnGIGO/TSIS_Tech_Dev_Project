package io.swagger.negocio.modelo;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.List;


@Entity
@Table(name = "lugar")
public class Lugar {
	@Id
	private String id;

	private String nombre;
	
	private String municipio;
	
	private String estado;
	
	private String descripcion;
	
	private String tipo;
	
	private String latitud;
	
	private String longitud;
	
	private String horarios;
	
	private int precio;
	
	@OneToMany(mappedBy = "lugar", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comentario> comentarios;
	
	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getHorarios() {
		return horarios;
	}

	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public List<Comentario> getComentario() {
		return comentarios;
	}

	public void setComentario(List<Comentario> comentario) {
		this.comentarios = comentarios;
	}


}
