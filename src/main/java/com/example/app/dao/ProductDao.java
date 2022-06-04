package com.example.app.dao;

import com.example.app.model.Products;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductDao {

    int insertProduct(UUID id, Products product);

    default int insertProduct(Products product){
        UUID id = UUID.randomUUID();
        return insertProduct(id, product);
    }

    int removeProduct(UUID id);

    int updateProduct(UUID id, Products product);

    Optional<Products> selectProductByID(UUID id);

    List<Products> selectAllProducts();

}
