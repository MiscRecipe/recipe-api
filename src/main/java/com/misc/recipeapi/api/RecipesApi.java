/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.7.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.misc.recipeapi.api;

import com.misc.recipeapi.model.CommonError;
import com.misc.recipeapi.model.SearchRecipeResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-07T19:03:27.012992+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
@Validated
@Tag(name = "recipes", description = "레시피 관련 API")
public interface RecipesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /misc/recipes : SearchRecipe
     * 레시피 검색 API  - 검색방법      - 분류별 검색  - 반환 해 주었으면 하는 정보      - 레시피 타이틀, 대표이미지, 개요, 재료정보(id, name)
     *
     * @param authorization  (required)
     * @param searchWord  (required)
     * @param tagIds  (required)
     * @param categories  (required)
     * @return OK (status code 200)
     *         or common error (status code 200)
     */
    @Operation(
        operationId = "miscRecipesGet",
        summary = "SearchRecipe",
        description = "레시피 검색 API  - 검색방법      - 분류별 검색  - 반환 해 주었으면 하는 정보      - 레시피 타이틀, 대표이미지, 개요, 재료정보(id, name)",
        tags = { "recipes" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SearchRecipeResponse.class))
            }),
            @ApiResponse(responseCode = "default", description = "common error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CommonError.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/misc/recipes",
        produces = { "application/json" }
    )
    
    default ResponseEntity<SearchRecipeResponse> miscRecipesGet(
        @NotNull @Parameter(name = "Authorization", description = "", required = true, in = ParameterIn.HEADER) @RequestHeader(value = "Authorization", required = true) String authorization,
        @NotNull @Parameter(name = "searchWord", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "searchWord", required = true) String searchWord,
        @NotNull @Parameter(name = "tagIds", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "tagIds", required = true) String tagIds,
        @NotNull @Parameter(name = "categories", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "categories", required = true) String categories
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"result\" : { \"recipes\" : [ { \"summary\" : \"summary\", \"name\" : \"name\", \"id\" : 0, \"thumbnailImage\" : \"https://openapi-generator.tech\", \"tags\" : { \"name\" : \"name\", \"id\" : 0 } }, { \"summary\" : \"summary\", \"name\" : \"name\", \"id\" : 0, \"thumbnailImage\" : \"https://openapi-generator.tech\", \"tags\" : { \"name\" : \"name\", \"id\" : 0 } } ] }, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"details\" : \"details\", \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
