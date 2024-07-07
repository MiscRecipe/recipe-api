package com.misc.recipeapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.misc.recipeapi.model.Tag;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Recipe
 */

@JsonTypeName("recipe")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T19:03:27.012992+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class Recipe {

  private Integer id;

  private String name;

  private String summary;

  private URI thumbnailImage;

  private Tag tags;

  public Recipe() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Recipe(Integer id, String name, String summary, URI thumbnailImage, Tag tags) {
    this.id = id;
    this.name = name;
    this.summary = summary;
    this.thumbnailImage = thumbnailImage;
    this.tags = tags;
  }

  public Recipe id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Recipe name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Recipe summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
   */
  @NotNull 
  @Schema(name = "summary", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public Recipe thumbnailImage(URI thumbnailImage) {
    this.thumbnailImage = thumbnailImage;
    return this;
  }

  /**
   * Get thumbnailImage
   * @return thumbnailImage
   */
  @NotNull @Valid 
  @Schema(name = "thumbnailImage", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("thumbnailImage")
  public URI getThumbnailImage() {
    return thumbnailImage;
  }

  public void setThumbnailImage(URI thumbnailImage) {
    this.thumbnailImage = thumbnailImage;
  }

  public Recipe tags(Tag tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @NotNull @Valid 
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tags")
  public Tag getTags() {
    return tags;
  }

  public void setTags(Tag tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recipe recipe = (Recipe) o;
    return Objects.equals(this.id, recipe.id) &&
        Objects.equals(this.name, recipe.name) &&
        Objects.equals(this.summary, recipe.summary) &&
        Objects.equals(this.thumbnailImage, recipe.thumbnailImage) &&
        Objects.equals(this.tags, recipe.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, summary, thumbnailImage, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipe {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    thumbnailImage: ").append(toIndentedString(thumbnailImage)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

