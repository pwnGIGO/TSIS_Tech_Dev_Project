package io.swagger.negocio.modelo;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity // Indica que hay que persistir en BD
@EqualsAndHashCode

public class Hospedaje {
    private String nombre;

    private String direccion;

    private String telefono;

    private String sitioWeb;

    private String descripcion;

    private String latitud;

    private String longitud;

    private BigDecimal precio;
    
    private String tipo;

    private String estacionamiento;

    private String piscina;

    private String habitacion;

    private String lavanderia;

    private String wifi;

    private String mascotas;
}
