package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.InlineResponse200Comentarios;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200Lugares
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-25T20:53:21.707-05:00[America/Mexico_City]")


public class InlineResponse200Lugares   {
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
  private List<InlineResponse200Comentarios> comentarios = null;

  public InlineResponse200Lugares id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "12345678", description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse200Lugares nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
   **/
  @Schema(example = "Revolucion", description = "")
  
    public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public InlineResponse200Lugares municipio(String municipio) {
    this.municipio = municipio;
    return this;
  }

  /**
   * Get municipio
   * @return municipio
   **/
  @Schema(example = "Centro", description = "")
  
    public String getMunicipio() {
    return municipio;
  }

  public void setMunicipio(String municipio) {
    this.municipio = municipio;
  }

  public InlineResponse200Lugares estado(String estado) {
    this.estado = estado;
    return this;
  }

  /**
   * Get estado
   * @return estado
   **/
  @Schema(example = "CDMX", description = "")
  
    public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public InlineResponse200Lugares descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  /**
   * Get descripcion
   * @return descripcion
   **/
  @Schema(example = "Monumento de la revolucion", description = "")
  
    public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public InlineResponse200Lugares tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Get tipo
   * @return tipo
   **/
  @Schema(example = "monumento", description = "")
  
    public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public InlineResponse200Lugares latitud(String latitud) {
    this.latitud = latitud;
    return this;
  }

  /**
   * Get latitud
   * @return latitud
   **/
  @Schema(example = "-99.0", description = "")
  
    public String getLatitud() {
    return latitud;
  }

  public void setLatitud(String latitud) {
    this.latitud = latitud;
  }

  public InlineResponse200Lugares longitud(String longitud) {
    this.longitud = longitud;
    return this;
  }

  /**
   * Get longitud
   * @return longitud
   **/
  @Schema(example = "12.0", description = "")
  
    public String getLongitud() {
    return longitud;
  }

  public void setLongitud(String longitud) {
    this.longitud = longitud;
  }

  public InlineResponse200Lugares horarios(String horarios) {
    this.horarios = horarios;
    return this;
  }

  /**
   * Get horarios
   * @return horarios
   **/
  @Schema(example = "De 9 a 5 pm", description = "")
  
    public String getHorarios() {
    return horarios;
  }

  public void setHorarios(String horarios) {
    this.horarios = horarios;
  }

  public InlineResponse200Lugares precio(BigDecimal precio) {
    this.precio = precio;
    return this;
  }

  /**
   * Get precio
   * @return precio
   **/
  @Schema(example = "50", description = "")
  
    @Valid
    public BigDecimal getPrecio() {
    return precio;
  }

  public void setPrecio(BigDecimal precio) {
    this.precio = precio;
  }

  public InlineResponse200Lugares comentarios(List<InlineResponse200Comentarios> comentarios) {
    this.comentarios = comentarios;
    return this;
  }

  public InlineResponse200Lugares addComentariosItem(InlineResponse200Comentarios comentariosItem) {
    if (this.comentarios == null) {
      this.comentarios = new ArrayList<InlineResponse200Comentarios>();
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
    public List<InlineResponse200Comentarios> getComentarios() {
    return comentarios;
  }

  public void setComentarios(List<InlineResponse200Comentarios> comentarios) {
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
    InlineResponse200Lugares inlineResponse200Lugares = (InlineResponse200Lugares) o;
    return Objects.equals(this.id, inlineResponse200Lugares.id) &&
        Objects.equals(this.nombre, inlineResponse200Lugares.nombre) &&
        Objects.equals(this.municipio, inlineResponse200Lugares.municipio) &&
        Objects.equals(this.estado, inlineResponse200Lugares.estado) &&
        Objects.equals(this.descripcion, inlineResponse200Lugares.descripcion) &&
        Objects.equals(this.tipo, inlineResponse200Lugares.tipo) &&
        Objects.equals(this.latitud, inlineResponse200Lugares.latitud) &&
        Objects.equals(this.longitud, inlineResponse200Lugares.longitud) &&
        Objects.equals(this.horarios, inlineResponse200Lugares.horarios) &&
        Objects.equals(this.precio, inlineResponse200Lugares.precio) &&
        Objects.equals(this.comentarios, inlineResponse200Lugares.comentarios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, municipio, estado, descripcion, tipo, latitud, longitud, horarios, precio, comentarios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Lugares {\n");
    
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
