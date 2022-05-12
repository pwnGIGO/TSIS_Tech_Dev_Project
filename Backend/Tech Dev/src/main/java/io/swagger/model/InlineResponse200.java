package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import io.swagger.model.InlineResponse200Lugares;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-25T20:53:21.707-05:00[America/Mexico_City]")


public class InlineResponse200   {
  @JsonProperty("lugares")
  @Valid
  private List<InlineResponse200Lugares> lugares = null;

  public InlineResponse200 lugares(List<InlineResponse200Lugares> lugares) {
    this.lugares = lugares;
    return this;
  }

  public InlineResponse200 addLugaresItem(InlineResponse200Lugares lugaresItem) {
    if (this.lugares == null) {
      this.lugares = new ArrayList<InlineResponse200Lugares>();
    }
    this.lugares.add(lugaresItem);
    return this;
  }

  /**
   * Get lugares
   * @return lugares
   **/
  @Schema(description = "")
      @Valid
    public List<InlineResponse200Lugares> getLugares() {
    return lugares;
  }

  public void setLugares(List<InlineResponse200Lugares> lugares) {
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
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.lugares, inlineResponse200.lugares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lugares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
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
