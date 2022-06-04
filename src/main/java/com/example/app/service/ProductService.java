package com.example.app.service;

import com.example.app.dao.ProductDao;
import com.example.app.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {
    private final ProductDao productDao;

    @Autowired
    public ProductService(@Qualifier("ProductDao") ProductDao productDao) {this.productDao = productDao;}

    public int addProduct(Products product) {return productDao.insertProduct(product);}

    public List<Products> getAllProducts() {return productDao.selectAllProducts();}

    public Optional<Products> getProductByID(UUID id) {return productDao.selectProductByID(id);}

    public int removeProduct(UUID id) {return productDao.removeProduct(id);}

    public int updateProductByID(UUID id, Products product) { return productDao.updateProduct(id, product);}
}
