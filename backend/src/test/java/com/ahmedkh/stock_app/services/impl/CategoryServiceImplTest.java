package com.ahmedkh.stock_app.services.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.ahmedkh.stock_app.dto.CategoryDto;
import com.ahmedkh.stock_app.exception.EntityNotFoundException;
import com.ahmedkh.stock_app.exception.ErrorCodes;
import com.ahmedkh.stock_app.exception.InvalidEntityException;
import com.ahmedkh.stock_app.model.Category;
import com.ahmedkh.stock_app.repository.ArticleRepository;
import com.ahmedkh.stock_app.repository.CategoryRepository;

import java.util.Collections;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CategoryServiceImplTest {

    @Mock
    private CategoryRepository categoryRepository;

    @Mock
    private ArticleRepository articleRepository;

    @InjectMocks
    private CategoryServiceImpl service;

    @Test
    public void shouldSaveCategoryWithSuccess() {
        CategoryDto expectedCategory = CategoryDto.builder()
                .code("Cat test")
                .designation("Designation test")
                .idEntreprise(1)
                .build();

        Category savedEntity = new Category();
        savedEntity.setCode(expectedCategory.getCode());
        savedEntity.setDesignation(expectedCategory.getDesignation());
        savedEntity.setIdEntreprise(expectedCategory.getIdEntreprise());
        savedEntity.setId(123);

        when(categoryRepository.save(any(Category.class))).thenReturn(savedEntity);

        CategoryDto savedCategory = service.save(expectedCategory);

        assertNotNull(savedCategory);
        assertNotNull(savedCategory.getId());
        assertEquals(expectedCategory.getCode(), savedCategory.getCode());
        assertEquals(expectedCategory.getDesignation(), savedCategory.getDesignation());
        assertEquals(expectedCategory.getIdEntreprise(), savedCategory.getIdEntreprise());
        verify(categoryRepository, times(1)).save(any(Category.class));
    }

    @Test
    public void shouldThrowInvalidEntityException() {
        CategoryDto expectedCategory = CategoryDto.builder().build();

        InvalidEntityException expectedException = assertThrows(InvalidEntityException.class,
                () -> service.save(expectedCategory));

        assertEquals(ErrorCodes.CATEGORY_NOT_VALID, expectedException.getErrorCode());
        assertEquals(1, expectedException.getErrors().size());
        assertEquals("Veuillez renseigner le code de la categorie", expectedException.getErrors().get(0));
    }

    @Test
    public void shouldThrowInvalidEntityExceptionWhenDtoNull() {
        InvalidEntityException expectedException = assertThrows(InvalidEntityException.class,
                () -> service.save(null));

        assertEquals(ErrorCodes.CATEGORY_NOT_VALID, expectedException.getErrorCode());
        assertEquals(1, expectedException.getErrors().size());
        assertEquals("Veuillez renseigner le code de la categorie", expectedException.getErrors().get(0));
    }

    @Test
    public void shouldThrowEntityNotFoundForFindById() {
        when(categoryRepository.findById(999)).thenReturn(Optional.empty());

        EntityNotFoundException exception = assertThrows(EntityNotFoundException.class, () -> service.findById(999));
        assertEquals(ErrorCodes.CATEGORY_NOT_FOUND, exception.getErrorCode());
    }

    @Test
    public void shouldFindByIdWithSuccess() {
        Category category = new Category();
        category.setId(1);
        category.setCode("CAT");
        category.setDesignation("DES");

        when(categoryRepository.findById(1)).thenReturn(Optional.of(category));

        CategoryDto dto = service.findById(1);
        assertNotNull(dto);
        assertEquals(1, dto.getId());
        assertEquals("CAT", dto.getCode());
        assertEquals("DES", dto.getDesignation());
    }
}
