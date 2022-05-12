package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import io.swagger.model.InlineResponse2001Hoteles;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2001
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-25T20:53:21.707-05:00[America/Mexico_City]")


public class InlineResponse2001   {
  @JsonProperty("hoteles")
  @Valid
  private List<InlineResponse2001Hoteles> hoteles = null;

  public InlineResponse2001 hoteles(List<InlineResponse2001Hoteles> hoteles) {
    this.hoteles = hoteles;
    return this;
  }

  public InlineResponse2001 addHotelesItem(InlineResponse2001Hoteles hotelesItem) {
    if (this.hoteles == null) {
      this.hoteles = new ArrayList<InlineResponse2001Hoteles>();
    }
    this.hoteles.add(hotelesItem);
    return this;
  }

  /**
   * Get hoteles
   * @return hoteles
   **/
  @Schema(description = "")
      @Valid
    public List<InlineResponse2001Hoteles> getHoteles() {
    return hoteles;
  }

  public void setHoteles(List<InlineResponse2001Hoteles> hoteles) {
    this.hoteles = hoteles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.hoteles, inlineResponse2001.hoteles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hoteles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    hoteles: ").append(toIndentedString(hoteles)).append("\n");
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
