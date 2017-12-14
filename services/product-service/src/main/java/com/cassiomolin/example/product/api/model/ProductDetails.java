package com.cassiomolin.example.product.api.model;

import com.cassiomolin.example.commons.api.validation.groups.Create;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * API model for a product.
 *
 * @author cassiomolin
 */
public class ProductDetails {

    @Null(groups = Create.class)
    private String id;

    @NotNull
    @NotBlank
    private String name;

    public String getId() {
        return id;
    }

    public ProductDetails setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductDetails setName(String name) {
        this.name = name;
        return this;
    }
}