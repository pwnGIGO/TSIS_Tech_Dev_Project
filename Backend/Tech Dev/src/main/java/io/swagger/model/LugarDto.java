package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import io.swagger.model.LugarDtoComentarios;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LugarDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-25T20:53:21.707-05:00[America/Mexico_City]")


public class LugarDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("municipio")
  private String municipio = null;

  @JsonProperty("estado")
  private String estado = null;

  @JsonProperty("descripcion")
  private String descripcion = null;

  @JsonProperty("tipo")
  private String tipo = null;

  @JsonProperty("latitud")
  private String latitud = null;

  @JsonProperty("longitud")
  private String longitud = null;

  @JsonProperty("horarios")
  private String horarios = null;

  @JsonProperty("precio")
  private BigDecimal precio = null;

  @JsonProperty("comentarios")
  @Valid
  private List<LugarDtoComentarios> comentarios = null;

  public LugarDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "2134457654324", description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LugarDto nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
   **/
  @Schema(example = "Chichén Itzá", description = "")
  
    public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public LugarDto municipio(String municipio) {
    this.municipio = municipio;
    return this;
  }

  /**
   * Get municipio
   * @return municipio
   **/
  @Schema(example = "Tinum", description = "")
  
    public String getMunicipio() {
    return municipio;
  }

  public void setMunicipio(String municipio) {
    this.municipio = municipio;
  }

  public LugarDto estado(String estado) {
    this.estado = estado;
    return this;
  }

  /**
   * Get estado
   * @return estado
   **/
  @Schema(example = "Yucatán", description = "")
  
    public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public LugarDto descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  /**
   * Get descripcion
   * @return descripcion
   **/
  @Schema(example = "La ciudad es...", description = "")
  
    public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public LugarDto tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Get tipo
   * @return tipo
   **/
  @Schema(example = "Zona arqueologica", description = "")
  
    public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public LugarDto latitud(String latitud) {
    this.latitud = latitud;
    return this;
  }

  /**
   * Get latitud
   * @return latitud
   **/
  @Schema(example = "20.683032102156055", description = "")
  
    public String getLatitud() {
    return latitud;
  }

  public void setLatitud(String latitud) {
    this.latitud = latitud;
  }

  public LugarDto longitud(String longitud) {
    this.longitud = longitud;
    return this;
  }

  /**
   * Get longitud
   * @return longitud
   **/
  @Schema(example = "20.683032102156055", description = "")
  
    public String getLongitud() {
    return longitud;
  }

  public void setLongitud(String longitud) {
    this.longitud = longitud;
  }

  public LugarDto horarios(String horarios) {
    this.horarios = horarios;
    return this;
  }

  /**
   * Get horarios
   * @return horarios
   **/
  @Schema(example = "Lunes a Viernes de 12:00 a 16:00, Sábado y Domingo de 09:00 a 18:00", description = "")
  
    public String getHorarios() {
    return horarios;
  }

  public void setHorarios(String horarios) {
    this.horarios = horarios;
  }

  public LugarDto precio(BigDecimal precio) {
    this.precio = precio;
    return this;
  }

  /**
   * Get precio
   * @return precio
   **/
  @Schema(example = "20", description = "")
  
    @Valid
    public BigDecimal getPrecio() {
    return precio;
  }

  public void setPrecio(BigDecimal precio) {
    this.precio = precio;
  }

  public LugarDto comentarios(List<LugarDtoComentarios> comentarios) {
    this.comentarios = comentarios;
    return this;
  }

  public LugarDto addComentariosItem(LugarDtoComentarios comentariosItem) {
    if (this.comentarios == null) {
      this.comentarios = new ArrayList<LugarDtoComentarios>();
    }
    this.comentarios.add(comentariosItem);
    return this;
  }

  /**
   * Get comentarios
   * @return comentarios
   **/
  @Schema(description = "")
      @Valid
    public List<LugarDtoComentarios> getComentarios() {
    return comentarios;
  }

  public void setComentarios(List<LugarDtoComentarios> comentarios) {
    this.comentarios = comentarios;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LugarDto lugarDto = (LugarDto) o;
    return Objects.equals(this.id, lugarDto.id) &&
        Objects.equals(this.nombre, lugarDto.nombre) &&
        Objects.equals(this.municipio, lugarDto.municipio) &&
        Objects.equals(this.estado, lugarDto.estado) &&
        Objects.equals(this.descripcion, lugarDto.descripcion) &&
        Objects.equals(this.tipo, lugarDto.tipo) &&
        Objects.equals(this.latitud, lugarDto.latitud) &&
        Objects.equals(this.longitud, lugarDto.longitud) &&
        Objects.equals(this.horarios, lugarDto.horarios) &&
        Objects.equals(this.precio, lugarDto.precio) &&
        Objects.equals(this.comentarios, lugarDto.comentarios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, municipio, estado, descripcion, tipo, latitud, longitud, horarios, precio, comentarios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LugarDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    municipio: ").append(toIndentedString(municipio)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    latitud: ").append(toIndentedString(latitud)).append("\n");
    sb.append("    longitud: ").append(toIndentedString(longitud)).append("\n");
    sb.append("    horarios: ").append(toIndentedString(horarios)).append("\n");
    sb.append("    precio: ").append(toIndentedString(precio)).append("\n");
    sb.append("    comentarios: ").append(toIndentedString(comentarios)).append("\n");
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
