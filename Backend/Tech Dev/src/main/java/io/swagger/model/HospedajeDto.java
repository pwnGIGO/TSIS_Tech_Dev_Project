package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HospedajeDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-25T20:53:21.707-05:00[America/Mexico_City]")


public class HospedajeDto   {
  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("telefono")
  private String telefono = null;
  
  @JsonProperty("foto")
  private String foto = null;

  @JsonProperty("descripcion")
  private String descripcion = null;

  @JsonProperty("latitud")
  private String latitud = null;

  @JsonProperty("longitud")
  private String longitud = null;

  @JsonProperty("precio")
  private int precio;

  public HospedajeDto nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
   **/
  @Schema(example = "Hotel Finisterre", description = "")
  
    public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  
  public HospedajeDto telefono(String telefono) {
    this.telefono = telefono;
    return this;
  }

  /**
   * Get telefono
   * @return telefono
   **/
  @Schema(example = "525556899544", description = "")
  
    public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public HospedajeDto descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  /**
   * Get descripcion
   * @return descripcion
   **/
  @Schema(example = "Bulliciosa zona de moda con arquitectura colonial, el Jardín Centenario y el Museo Frida Kahlo.", description = "")
  
    public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public HospedajeDto latitud(String latitud) {
    this.latitud = latitud;
    return this;
  }
  
  
  /**
   * Get foto
   * @return foto
   **/
  @Schema(example = "Hotel Finisterre", description = "")
  
    public String getFoto() {
    return foto;
  }

  public void setFoto(String foto) {
    this.foto = foto;
  }

  public HospedajeDto foto(String foto) {
    this.foto = foto;
    return this;
  }
  

  /**
   * Get latitud
   * @return latitud
   **/
  @Schema(example = "19.34512356266588", description = "")
  
    public String getLatitud() {
    return latitud;
  }

  public void setLatitud(String latitud) {
    this.latitud = latitud;
  }

  public HospedajeDto longitud(String longitud) {
    this.longitud = longitud;
    return this;
  }

  /**
   * Get longitud
   * @return longitud
   **/
  @Schema(example = "-99.14457352718428", description = "")
  
    public String getLongitud() {
    return longitud;
  }

  public void setLongitud(String longitud) {
    this.longitud = longitud;
  }

  public HospedajeDto precio(int precio) {
    this.precio = precio;
    return this;
  }

  /**
   * Get precio
   * @return precio
   **/
  @Schema(example = "1500", description = "")
  
    @Valid
    public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HospedajeDto hospedajeDto = (HospedajeDto) o;
    return Objects.equals(this.nombre, hospedajeDto.nombre) &&
        Objects.equals(this.telefono, hospedajeDto.telefono) &&
        Objects.equals(this.descripcion, hospedajeDto.descripcion) &&
        Objects.equals(this.foto, hospedajeDto.foto) &&
        Objects.equals(this.latitud, hospedajeDto.latitud) &&
        Objects.equals(this.longitud, hospedajeDto.longitud) &&
        Objects.equals(this.precio, hospedajeDto.precio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, telefono, descripcion, foto, latitud, longitud, precio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HospedajeDto {\n");
    
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("    foto: ").append(toIndentedString(foto)).append("\n");
    sb.append("    latitud: ").append(toIndentedString(latitud)).append("\n");
    sb.append("    longitud: ").append(toIndentedString(longitud)).append("\n");
    sb.append("    precio: ").append(toIndentedString(precio)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
