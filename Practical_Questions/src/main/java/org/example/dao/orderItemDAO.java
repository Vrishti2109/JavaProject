package org.example.dao;

import org.example.entities.OrderItem;
import org.example.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderItemDAO extends JpaRepository<OrderItem,Integer> {

    void createProduct(OrderItem o);
    OrderItem findbyId(int id);
    boolean updateProduct(String product, float price);

    void deleteProduct(OrderItem o);
}
