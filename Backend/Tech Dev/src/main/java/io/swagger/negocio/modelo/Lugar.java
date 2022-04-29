package io.swagger.negocio.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


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

public class Lugar {
    @Id
    @GeneratedValue 
    private Integer id;

    private String nombre;

    private String municipio;

    private String descripcion;

    private String tipo;

    private String latitud;

    private String longitud;

    private String horarios;

    private BigDecimal precio;
}
