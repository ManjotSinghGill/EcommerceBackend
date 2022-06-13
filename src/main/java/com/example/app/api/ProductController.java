package com.example.app.api;


import com.example.app.model.Products;
import com.example.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/controller/product")
@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {this.productService = productService;}

    @PostMapping
    public void addProduct(@RequestBody Products product){ productService.addProduct(product);}

    @GetMapping
    public List<Products> getAllProducts() {return productService.getAllProducts();}

    @GetMapping(path = "{id}")
    public Products getProductByID(@PathVariable("id")UUID id) {return productService.getProductByID(id).orElse(null);}

    @DeleteMapping(path = "{id}")
    public void removeProductByID(@PathVariable("id") UUID id) {productService.removeProduct(id);}

    @PutMapping(path = "{id}")
    public void updateProductByID(@PathVariable("id") UUID id, @RequestBody Products product){
        productService.updateProductByID(id, product);
    }

    @GetMapping(path = "/category/{category}")
    public List<Products> selectProductByCategory(@PathVariable("category") String category){
        return productService.selectProductByCategory(category);
    }
}
