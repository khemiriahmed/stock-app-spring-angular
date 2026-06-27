package com.ahmedkh.stock_app.dto;

import java.util.List;

import com.ahmedkh.stock_app.model.Category;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class CategoryDto {

    private Integer id;

    private String code;

    private String designation;

    private List<ArticleDto> articles;

    public CategoryDto fromEntity(Category category) {
        if (category == null) {
            return null;
        }

        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();
    }


    public Category toEntity(CategoryDto categoryDto){
        if(categoryDto == null) {
            return null;
        }

        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setDesignation(categoryDto.getDesignation());

        return category;
    }
}
