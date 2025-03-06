package org.example.dao;

import org.example.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

public interface productDAO extends JpaRepository<Product,Integer> {
   void createProduct(Product p);
   Product findbyId(int id);
   boolean updateProduct(String product, float price);

   void deleteProduct(Product p);


}
