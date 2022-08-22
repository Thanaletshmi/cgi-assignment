package com.cgi.nl.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecipeInfo {

    @ApiModelProperty(notes = "Recipe Title", example = "Barbecued Grilled Portobello Sandwich")
    private String title;

    @ApiModelProperty(notes = "Recipe Title", example = "http://www.kraftfoods.com/kf/recipes/barbecued-grilled-portobello-sandwich-53215.aspx")
    private String href;

    @ApiModelProperty(notes = "List of Ingredients", example = "[onions, red chilli]")
    private List<String> ingredients;

    @ApiModelProperty(notes = "Recipe Image", example = "http://img.recipepuppy.com/646777.jpg")
    private String thumbnail;

}
