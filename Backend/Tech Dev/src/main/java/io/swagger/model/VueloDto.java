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
 * VueloDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-22T16:08:57.773-05:00[America/Mexico_City]")


public class VueloDto   {
  @JsonProperty("aerolinea")
  private String aerolinea = null;

  @JsonProperty("origen")
  private String origen = null;

  @JsonProperty("destino")
  private String destino = null;

  @JsonProperty("fechaSalida")
  private String fechaSalida = null;

  @JsonProperty("horaSalida")
  private String horaSalida = null;

  @JsonProperty("fechaLlegada")
  private String fechaLlegada = null;

  @JsonProperty("horaLlegada")
  private String horaLlegada = null;

  @JsonProperty("asiento")
  private String asiento = null;

  @JsonProperty("precio")
  private BigDecimal precio = null;

  @JsonProperty("tipoEquipaje")
  private String tipoEquipaje = null;

  public VueloDto aerolinea(String aerolinea) {
    this.aerolinea = aerolinea;
    return this;
  }

  /**
   * Get aerolinea
   * @return aerolinea
   **/
  @Schema(description = "")
  
    public String getAerolinea() {
    return aerolinea;
  }

  public void setAerolinea(String aerolinea) {
    this.aerolinea = aerolinea;
  }

  public VueloDto origen(String origen) {
    this.origen = origen;
    return this;
  }

  /**
   * Get origen
   * @return origen
   **/
  @Schema(description = "")
  
    public String getOrigen() {
    return origen;
  }

  public void setOrigen(String origen) {
    this.origen = origen;
  }

  public VueloDto destino(String destino) {
    this.destino = destino;
    return this;
  }

  /**
   * Get destino
   * @return destino
   **/
  @Schema(description = "")
  
    public String getDestino() {
    return destino;
  }

  public void setDestino(String destino) {
    this.destino = destino;
  }

  public VueloDto fechaSalida(String fechaSalida) {
    this.fechaSalida = fechaSalida;
    return this;
  }

  /**
   * Get fechaSalida
   * @return fechaSalida
   **/
  @Schema(description = "")
  
    public String getFechaSalida() {
    return fechaSalida;
  }

  public void setFechaSalida(String fechaSalida) {
    this.fechaSalida = fechaSalida;
  }

  public VueloDto horaSalida(String horaSalida) {
    this.horaSalida = horaSalida;
    return this;
  }

  /**
   * Get horaSalida
   * @return horaSalida
   **/
  @Schema(description = "")
  
    public String getHoraSalida() {
    return horaSalida;
  }

  public void setHoraSalida(String horaSalida) {
    this.horaSalida = horaSalida;
  }

  public VueloDto fechaLlegada(String fechaLlegada) {
    this.fechaLlegada = fechaLlegada;
    return this;
  }

  /**
   * Get fechaLlegada
   * @return fechaLlegada
   **/
  @Schema(description = "")
  
    public String getFechaLlegada() {
    return fechaLlegada;
  }

  public void setFechaLlegada(String fechaLlegada) {
    this.fechaLlegada = fechaLlegada;
  }

  public VueloDto horaLlegada(String horaLlegada) {
    this.horaLlegada = horaLlegada;
    return this;
  }

  /**
   * Get horaLlegada
   * @return horaLlegada
   **/
  @Schema(description = "")
  
    public String getHoraLlegada() {
    return horaLlegada;
  }

  public void setHoraLlegada(String horaLlegada) {
    this.horaLlegada = horaLlegada;
  }

  public VueloDto asiento(String asiento) {
    this.asiento = asiento;
    return this;
  }

  /**
   * Get asiento
   * @return asiento
   **/
  @Schema(description = "")
  
    public String getAsiento() {
    return asiento;
  }

  public void setAsiento(String asiento) {
    this.asiento = asiento;
  }

  public VueloDto precio(BigDecimal precio) {
    this.precio = precio;
    return this;
  }

  /**
   * Get precio
   * @return precio
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getPrecio() {
    return precio;
  }

  public void setPrecio(BigDecimal precio) {
    this.precio = precio;
  }

  public VueloDto tipoEquipaje(String tipoEquipaje) {
    this.tipoEquipaje = tipoEquipaje;
    return this;
  }

  /**
   * Get tipoEquipaje
   * @return tipoEquipaje
   **/
  @Schema(description = "")
  
    public String getTipoEquipaje() {
    return tipoEquipaje;
  }

  public void setTipoEquipaje(String tipoEquipaje) {
    this.tipoEquipaje = tipoEquipaje;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VueloDto vueloDto = (VueloDto) o;
    return Objects.equals(this.aerolinea, vueloDto.aerolinea) &&
        Objects.equals(this.origen, vueloDto.origen) &&
        Objects.equals(this.destino, vueloDto.destino) &&
        Objects.equals(this.fechaSalida, vueloDto.fechaSalida) &&
        Objects.equals(this.horaSalida, vueloDto.horaSalida) &&
        Objects.equals(this.fechaLlegada, vueloDto.fechaLlegada) &&
        Objects.equals(this.horaLlegada, vueloDto.horaLlegada) &&
        Objects.equals(this.asiento, vueloDto.asiento) &&
        Objects.equals(this.precio, vueloDto.precio) &&
        Objects.equals(this.tipoEquipaje, vueloDto.tipoEquipaje);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aerolinea, origen, destino, fechaSalida, horaSalida, fechaLlegada, horaLlegada, asiento, precio, tipoEquipaje);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VueloDto {\n");
    
    sb.append("    aerolinea: ").append(toIndentedString(aerolinea)).append("\n");
    sb.append("    origen: ").append(toIndentedString(origen)).append("\n");
    sb.append("    destino: ").append(toIndentedString(destino)).append("\n");
    sb.append("    fechaSalida: ").append(toIndentedString(fechaSalida)).append("\n");
    sb.append("    horaSalida: ").append(toIndentedString(horaSalida)).append("\n");
    sb.append("    fechaLlegada: ").append(toIndentedString(fechaLlegada)).append("\n");
    sb.append("    horaLlegada: ").append(toIndentedString(horaLlegada)).append("\n");
    sb.append("    asiento: ").append(toIndentedString(asiento)).append("\n");
    sb.append("    precio: ").append(toIndentedString(precio)).append("\n");
    sb.append("    tipoEquipaje: ").append(toIndentedString(tipoEquipaje)).append("\n");
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
