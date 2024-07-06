package com.misc.recipeapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.misc.recipeapi.model.SearchRecipeResponseResult;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SearchRecipeResponse
 */

@JsonTypeName("search_recipe_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T00:41:41.895443+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class SearchRecipeResponse {

  private SearchRecipeResponseResult result;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  public SearchRecipeResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SearchRecipeResponse(SearchRecipeResponseResult result, OffsetDateTime timestamp) {
    this.result = result;
    this.timestamp = timestamp;
  }

  public SearchRecipeResponse result(SearchRecipeResponseResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   */
  @NotNull @Valid 
  @Schema(name = "result", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("result")
  public SearchRecipeResponseResult getResult() {
    return result;
  }

  public void setResult(SearchRecipeResponseResult result) {
    this.result = result;
  }

  public SearchRecipeResponse timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   */
  @NotNull @Valid 
  @Schema(name = "timestamp", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRecipeResponse searchRecipeResponse = (SearchRecipeResponse) o;
    return Objects.equals(this.result, searchRecipeResponse.result) &&
        Objects.equals(this.timestamp, searchRecipeResponse.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRecipeResponse {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

