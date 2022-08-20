package com.cgi.nl.model;

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

    private String title;

    private String href;

    private List<String> ingredients;

    private String thumbnail;

}
