package org.example.dao;

import org.example.entities.OrderItem;
import org.example.entities.Product;
import org.example.entities.PurchaseOrder;
import org.example.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierDAO extends JpaRepository<Product,Integer> {
    void createSupplier(Supplier s);
    Supplier findbyId(int id);
    boolean updateSupplier(String product, String name);

    void deleteSupplier(Supplier s);
}
