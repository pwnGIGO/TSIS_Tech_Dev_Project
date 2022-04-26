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
 * InlineResponse2001Hoteles
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-25T20:53:21.707-05:00[America/Mexico_City]")


public class InlineResponse2001Hoteles   {
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
  private BigDecimal precio = null;

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

  public InlineResponse2001Hoteles nombre(String nombre) {
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

  public InlineResponse2001Hoteles direccion(String direccion) {
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

  public InlineResponse2001Hoteles telefono(String telefono) {
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

  public InlineResponse2001Hoteles sitioWeb(String sitioWeb) {
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

  public InlineResponse2001Hoteles descripcion(String descripcion) {
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

  public InlineResponse2001Hoteles latitud(String latitud) {
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

  public InlineResponse2001Hoteles longitud(String longitud) {
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

  public InlineResponse2001Hoteles precio(BigDecimal precio) {
    this.precio = precio;
    return this;
  }

  /**
   * Get precio
   * @return precio
   **/
  @Schema(example = "1500", description = "")
  
    @Valid
    public BigDecimal getPrecio() {
    return precio;
  }

  public void setPrecio(BigDecimal precio) {
    this.precio = precio;
  }

  public InlineResponse2001Hoteles tipo(String tipo) {
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

  public InlineResponse2001Hoteles estacionamiento(String estacionamiento) {
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

  public InlineResponse2001Hoteles piscina(String piscina) {
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

  public InlineResponse2001Hoteles habitacion(String habitacion) {
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

  public InlineResponse2001Hoteles lavanderia(String lavanderia) {
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

  public InlineResponse2001Hoteles wifi(String wifi) {
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

  public InlineResponse2001Hoteles mascotas(String mascotas) {
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
    InlineResponse2001Hoteles inlineResponse2001Hoteles = (InlineResponse2001Hoteles) o;
    return Objects.equals(this.nombre, inlineResponse2001Hoteles.nombre) &&
        Objects.equals(this.direccion, inlineResponse2001Hoteles.direccion) &&
        Objects.equals(this.telefono, inlineResponse2001Hoteles.telefono) &&
        Objects.equals(this.sitioWeb, inlineResponse2001Hoteles.sitioWeb) &&
        Objects.equals(this.descripcion, inlineResponse2001Hoteles.descripcion) &&
        Objects.equals(this.latitud, inlineResponse2001Hoteles.latitud) &&
        Objects.equals(this.longitud, inlineResponse2001Hoteles.longitud) &&
        Objects.equals(this.precio, inlineResponse2001Hoteles.precio) &&
        Objects.equals(this.tipo, inlineResponse2001Hoteles.tipo) &&
        Objects.equals(this.estacionamiento, inlineResponse2001Hoteles.estacionamiento) &&
        Objects.equals(this.piscina, inlineResponse2001Hoteles.piscina) &&
        Objects.equals(this.habitacion, inlineResponse2001Hoteles.habitacion) &&
        Objects.equals(this.lavanderia, inlineResponse2001Hoteles.lavanderia) &&
        Objects.equals(this.wifi, inlineResponse2001Hoteles.wifi) &&
        Objects.equals(this.mascotas, inlineResponse2001Hoteles.mascotas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, direccion, telefono, sitioWeb, descripcion, latitud, longitud, precio, tipo, estacionamiento, piscina, habitacion, lavanderia, wifi, mascotas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001Hoteles {\n");
    
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
