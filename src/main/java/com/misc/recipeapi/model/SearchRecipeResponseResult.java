package com.misc.recipeapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.misc.recipeapi.model.Recipe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SearchRecipeResponseResult
 */

@JsonTypeName("search_recipe_response_result")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T00:41:41.895443+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class SearchRecipeResponseResult {

  @Valid
  private List<@Valid Recipe> recipes = new ArrayList<>();

  public SearchRecipeResponseResult recipes(List<@Valid Recipe> recipes) {
    this.recipes = recipes;
    return this;
  }

  public SearchRecipeResponseResult addRecipesItem(Recipe recipesItem) {
    if (this.recipes == null) {
      this.recipes = new ArrayList<>();
    }
    this.recipes.add(recipesItem);
    return this;
  }

  /**
   * Get recipes
   * @return recipes
   */
  @Valid 
  @Schema(name = "recipes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recipes")
  public List<@Valid Recipe> getRecipes() {
    return recipes;
  }

  public void setRecipes(List<@Valid Recipe> recipes) {
    this.recipes = recipes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRecipeResponseResult searchRecipeResponseResult = (SearchRecipeResponseResult) o;
    return Objects.equals(this.recipes, searchRecipeResponseResult.recipes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRecipeResponseResult {\n");
    sb.append("    recipes: ").append(toIndentedString(recipes)).append("\n");
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

