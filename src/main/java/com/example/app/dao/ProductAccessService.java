package com.example.app.dao;

import com.example.app.model.Products;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("ProductDao")
public class ProductAccessService implements ProductDao{

    private static List<Products> DB = new ArrayList<>();

    @Override
    public int insertProduct(UUID id, Products product) {
        DB.add(new Products(id, product.getName(), product.getPrice(), product.getColor(),  product.getSize(), product.getCategory()));
        return 1;
    }

    @Override
    public int removeProduct(UUID id) {
        Optional<Products> productToDelete = selectProductByID(id);
        if(productToDelete.isEmpty()){
            return 0;
        }
        DB.remove(productToDelete.get());
        return 1;
    }

    @Override
    public int updateProduct(UUID id, Products product) {
        return selectProductByID(id)
                .map(p -> {
                    int indexOfProductToUpdate = DB.indexOf(p);
                    if(indexOfProductToUpdate >=0){
                        DB.set(indexOfProductToUpdate, new Products(id, product.getName(), product.getPrice(), product.getColor(), product.getSize(), product.getCategory()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }

    @Override
    public Optional<Products> selectProductByID(UUID id) {
        return DB.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<Products> selectAllProducts() {
        return DB;
    }

    @Override
    public List<Products> selectProductByCategory(String category) {
        List<Products> categoryList = new ArrayList<>();
        for (int i=0; i < DB.size(); i++) {
            if (DB.get(i).getCategory().equals(category)) {
                Products temp = DB.get(i);
                categoryList.add(new Products(temp.getId(), temp.getName(), temp.getPrice(), temp.getColor(), temp.getSize(), temp.getCategory()));
            }
        }
        return categoryList;
    }
}
