package org.example.Services;

import  org.example.dao.productDAO;
import org.example.entities.Product;

public class ProductServices {
    private productDAO product;
    void addProduct(Product p){
        product.save(p);
    }
    void removeProduct(Product p){
        product.deleteProduct(p);
    }

    void updateProduct (Product p){
        product.save(p);
    }
}
