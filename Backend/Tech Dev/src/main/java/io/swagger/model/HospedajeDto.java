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

  @JsonProperty("direccion")
  private String direccion = null;

  @JsonProperty("telefono")
  private String telefono = null;

  @JsonProperty("sitioWeb")
  private String sitioWeb = null;

  @JsonProperty("descripcion")
  private String descripcion = null;

  @JsonProperty("latitud")
  private String latitud = null;

  @JsonProperty("longitud")
  private String longitud = null;

  @JsonProperty("precio")
  private int precio;

  @JsonProperty("tipo")
  private String tipo = null;

  @JsonProperty("estacionamiento")
  private String estacionamiento = null;

  @JsonProperty("piscina")
  private String piscina = null;

  @JsonProperty("habitacion")
  private String habitacion = null;

  @JsonProperty("lavanderia")
  private String lavanderia = null;

  @JsonProperty("wifi")
  private String wifi = null;

  @JsonProperty("mascotas")
  private String mascotas = null;

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

  public HospedajeDto direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }

  /**
   * Get direccion
   * @return direccion
   **/
  @Schema(example = "Calz. de Tlalpan 2043, Parque San Andrés, Coyoacán, 04040 Ciudad de México, CDMX", description = "")
  
    public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
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

  public HospedajeDto sitioWeb(String sitioWeb) {
    this.sitioWeb = sitioWeb;
    return this;
  }

  /**
   * Get sitioWeb
   * @return sitioWeb
   **/
  @Schema(example = "http://www.hotelfinisterre.com.mx/", description = "")
  
    public String getSitioWeb() {
    return sitioWeb;
  }

  public void setSitioWeb(String sitioWeb) {
    this.sitioWeb = sitioWeb;
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

  public HospedajeDto tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Get tipo
   * @return tipo
   **/
  @Schema(example = "Hotel", description = "")
  
    public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public HospedajeDto estacionamiento(String estacionamiento) {
    this.estacionamiento = estacionamiento;
    return this;
  }

  /**
   * Get estacionamiento
   * @return estacionamiento
   **/
  @Schema(example = "si", description = "")
  
    public String getEstacionamiento() {
    return estacionamiento;
  }

  public void setEstacionamiento(String estacionamiento) {
    this.estacionamiento = estacionamiento;
  }

  public HospedajeDto piscina(String piscina) {
    this.piscina = piscina;
    return this;
  }

  /**
   * Get piscina
   * @return piscina
   **/
  @Schema(example = "si", description = "")
  
    public String getPiscina() {
    return piscina;
  }

  public void setPiscina(String piscina) {
    this.piscina = piscina;
  }

  public HospedajeDto habitacion(String habitacion) {
    this.habitacion = habitacion;
    return this;
  }

  /**
   * Get habitacion
   * @return habitacion
   **/
  @Schema(example = "si", description = "")
  
    public String getHabitacion() {
    return habitacion;
  }

  public void setHabitacion(String habitacion) {
    this.habitacion = habitacion;
  }

  public HospedajeDto lavanderia(String lavanderia) {
    this.lavanderia = lavanderia;
    return this;
  }

  /**
   * Get lavanderia
   * @return lavanderia
   **/
  @Schema(example = "si", description = "")
  
    public String getLavanderia() {
    return lavanderia;
  }

  public void setLavanderia(String lavanderia) {
    this.lavanderia = lavanderia;
  }

  public HospedajeDto wifi(String wifi) {
    this.wifi = wifi;
    return this;
  }

  /**
   * Get wifi
   * @return wifi
   **/
  @Schema(example = "si", description = "")
  
    public String getWifi() {
    return wifi;
  }

  public void setWifi(String wifi) {
    this.wifi = wifi;
  }

  public HospedajeDto mascotas(String mascotas) {
    this.mascotas = mascotas;
    return this;
  }

  /**
   * Get mascotas
   * @return mascotas
   **/
  @Schema(example = "si", description = "")
  
    public String getMascotas() {
    return mascotas;
  }

  public void setMascotas(String mascotas) {
    this.mascotas = mascotas;
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
        Objects.equals(this.direccion, hospedajeDto.direccion) &&
        Objects.equals(this.telefono, hospedajeDto.telefono) &&
        Objects.equals(this.sitioWeb, hospedajeDto.sitioWeb) &&
        Objects.equals(this.descripcion, hospedajeDto.descripcion) &&
        Objects.equals(this.latitud, hospedajeDto.latitud) &&
        Objects.equals(this.longitud, hospedajeDto.longitud) &&
        Objects.equals(this.precio, hospedajeDto.precio) &&
        Objects.equals(this.tipo, hospedajeDto.tipo) &&
        Objects.equals(this.estacionamiento, hospedajeDto.estacionamiento) &&
        Objects.equals(this.piscina, hospedajeDto.piscina) &&
        Objects.equals(this.habitacion, hospedajeDto.habitacion) &&
        Objects.equals(this.lavanderia, hospedajeDto.lavanderia) &&
        Objects.equals(this.wifi, hospedajeDto.wifi) &&
        Objects.equals(this.mascotas, hospedajeDto.mascotas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, direccion, telefono, sitioWeb, descripcion, latitud, longitud, precio, tipo, estacionamiento, piscina, habitacion, lavanderia, wifi, mascotas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HospedajeDto {\n");
    
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    sitioWeb: ").append(toIndentedString(sitioWeb)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("    latitud: ").append(toIndentedString(latitud)).append("\n");
    sb.append("    longitud: ").append(toIndentedString(longitud)).append("\n");
    sb.append("    precio: ").append(toIndentedString(precio)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    estacionamiento: ").append(toIndentedString(estacionamiento)).append("\n");
    sb.append("    piscina: ").append(toIndentedString(piscina)).append("\n");
    sb.append("    habitacion: ").append(toIndentedString(habitacion)).append("\n");
    sb.append("    lavanderia: ").append(toIndentedString(lavanderia)).append("\n");
    sb.append("    wifi: ").append(toIndentedString(wifi)).append("\n");
    sb.append("    mascotas: ").append(toIndentedString(mascotas)).append("\n");
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
