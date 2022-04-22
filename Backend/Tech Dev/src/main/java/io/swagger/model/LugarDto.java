package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.LugarDtoComentarios;
import io.swagger.model.LugarDtoGeolocalizacion;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LugarDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-22T16:08:57.773-05:00[America/Mexico_City]")


public class LugarDto   {
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

  @JsonProperty("comentarios")
  @Valid
  private List<LugarDtoComentarios> comentarios = null;

  @JsonProperty("geolocalizacion")
  private LugarDtoGeolocalizacion geolocalizacion = null;

  @JsonProperty("horarios")
  @Valid
  private List<String> horarios = null;

  @JsonProperty("precios")
  @Valid
  private List<String> precios = null;

  public LugarDto nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
   **/
  @Schema(description = "")
  
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
  @Schema(description = "")
  
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
  @Schema(description = "")
  
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
  @Schema(description = "")
  
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
  @Schema(description = "")
  
    public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
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

  public LugarDto geolocalizacion(LugarDtoGeolocalizacion geolocalizacion) {
    this.geolocalizacion = geolocalizacion;
    return this;
  }

  /**
   * Get geolocalizacion
   * @return geolocalizacion
   **/
  @Schema(description = "")
  
    @Valid
    public LugarDtoGeolocalizacion getGeolocalizacion() {
    return geolocalizacion;
  }

  public void setGeolocalizacion(LugarDtoGeolocalizacion geolocalizacion) {
    this.geolocalizacion = geolocalizacion;
  }

  public LugarDto horarios(List<String> horarios) {
    this.horarios = horarios;
    return this;
  }

  public LugarDto addHorariosItem(String horariosItem) {
    if (this.horarios == null) {
      this.horarios = new ArrayList<String>();
    }
    this.horarios.add(horariosItem);
    return this;
  }

  /**
   * Get horarios
   * @return horarios
   **/
  @Schema(description = "")
  
    public List<String> getHorarios() {
    return horarios;
  }

  public void setHorarios(List<String> horarios) {
    this.horarios = horarios;
  }

  public LugarDto precios(List<String> precios) {
    this.precios = precios;
    return this;
  }

  public LugarDto addPreciosItem(String preciosItem) {
    if (this.precios == null) {
      this.precios = new ArrayList<String>();
    }
    this.precios.add(preciosItem);
    return this;
  }

  /**
   * Get precios
   * @return precios
   **/
  @Schema(description = "")
  
    public List<String> getPrecios() {
    return precios;
  }

  public void setPrecios(List<String> precios) {
    this.precios = precios;
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
    return Objects.equals(this.nombre, lugarDto.nombre) &&
        Objects.equals(this.municipio, lugarDto.municipio) &&
        Objects.equals(this.estado, lugarDto.estado) &&
        Objects.equals(this.descripcion, lugarDto.descripcion) &&
        Objects.equals(this.tipo, lugarDto.tipo) &&
        Objects.equals(this.comentarios, lugarDto.comentarios) &&
        Objects.equals(this.geolocalizacion, lugarDto.geolocalizacion) &&
        Objects.equals(this.horarios, lugarDto.horarios) &&
        Objects.equals(this.precios, lugarDto.precios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, municipio, estado, descripcion, tipo, comentarios, geolocalizacion, horarios, precios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LugarDto {\n");
    
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    municipio: ").append(toIndentedString(municipio)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    comentarios: ").append(toIndentedString(comentarios)).append("\n");
    sb.append("    geolocalizacion: ").append(toIndentedString(geolocalizacion)).append("\n");
    sb.append("    horarios: ").append(toIndentedString(horarios)).append("\n");
    sb.append("    precios: ").append(toIndentedString(precios)).append("\n");
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
