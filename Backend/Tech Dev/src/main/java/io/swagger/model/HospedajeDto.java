package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.LugarDtoGeolocalizacion;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HospedajeDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-22T16:08:57.773-05:00[America/Mexico_City]")


public class HospedajeDto   {
  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("municipio")
  private String municipio = null;

  @JsonProperty("estado")
  private String estado = null;

  @JsonProperty("descripcion")
  private String descripcion = null;

  @JsonProperty("geolocalizacion")
  private LugarDtoGeolocalizacion geolocalizacion = null;

  @JsonProperty("horarios")
  @Valid
  private List<String> horarios = null;

  @JsonProperty("precios")
  @Valid
  private List<String> precios = null;

  public HospedajeDto nombre(String nombre) {
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

  public HospedajeDto municipio(String municipio) {
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

  public HospedajeDto estado(String estado) {
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

  public HospedajeDto descripcion(String descripcion) {
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

  public HospedajeDto geolocalizacion(LugarDtoGeolocalizacion geolocalizacion) {
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

  public HospedajeDto horarios(List<String> horarios) {
    this.horarios = horarios;
    return this;
  }

  public HospedajeDto addHorariosItem(String horariosItem) {
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

  public HospedajeDto precios(List<String> precios) {
    this.precios = precios;
    return this;
  }

  public HospedajeDto addPreciosItem(String preciosItem) {
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
    HospedajeDto hospedajeDto = (HospedajeDto) o;
    return Objects.equals(this.nombre, hospedajeDto.nombre) &&
        Objects.equals(this.municipio, hospedajeDto.municipio) &&
        Objects.equals(this.estado, hospedajeDto.estado) &&
        Objects.equals(this.descripcion, hospedajeDto.descripcion) &&
        Objects.equals(this.geolocalizacion, hospedajeDto.geolocalizacion) &&
        Objects.equals(this.horarios, hospedajeDto.horarios) &&
        Objects.equals(this.precios, hospedajeDto.precios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, municipio, estado, descripcion, geolocalizacion, horarios, precios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HospedajeDto {\n");
    
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    municipio: ").append(toIndentedString(municipio)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
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
