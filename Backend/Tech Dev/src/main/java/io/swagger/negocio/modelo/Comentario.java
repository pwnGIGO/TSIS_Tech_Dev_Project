package io.swagger.negocio.modelo;

import javax.persistence.*;
  

@Entity
@Table(name = "comentario")
public class Comentario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String usuario;
	private String fecha;
	private String descripcion;
	
	@ManyToOne()
    @JoinColumn(name = "lugar_id")
    private Lugar lugar;

	//Getters and Setters Usuario
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	//Getters and Setters Fecha
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	//Getters and Stters Descripcion
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Lugar getLugar() {
		return lugar;
	}
	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}
}