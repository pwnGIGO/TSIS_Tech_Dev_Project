package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RestaurantDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-22T16:08:57.773-05:00[America/Mexico_City]")


public class RestaurantDto   {
  @JsonProperty("lugares")
  @Valid
  private List<String> lugares = null;

  public RestaurantDto lugares(List<String> lugares) {
    this.lugares = lugares;
    return this;
  }

  public RestaurantDto addLugaresItem(String lugaresItem) {
    if (this.lugares == null) {
      this.lugares = new ArrayList<String>();
    }
    this.lugares.add(lugaresItem);
    return this;
  }

  /**
   * Get lugares
   * @return lugares
   **/
  @Schema(description = "")
  
    public List<String> getLugares() {
    return lugares;
  }

  public void setLugares(List<String> lugares) {
    this.lugares = lugares;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestaurantDto restaurantDto = (RestaurantDto) o;
    return Objects.equals(this.lugares, restaurantDto.lugares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lugares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestaurantDto {\n");
    
    sb.append("    lugares: ").append(toIndentedString(lugares)).append("\n");
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
