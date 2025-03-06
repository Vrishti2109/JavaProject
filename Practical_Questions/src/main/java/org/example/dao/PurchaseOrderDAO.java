package org.example.dao;

import org.example.entities.OrderItem;
import org.example.entities.Product;
import org.example.entities.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderDAO extends JpaRepository<Product,Integer> {
    void createPurchaseOrer(OrderItem o);
    PurchaseOrder findbyId(int id);
    boolean updateOrder(String product, float price);

    void deletePurchaseOrder(PurchaseOrder o);
}
