package org.example.dao;

import org.example.entities.Product;
import org.example.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Product,Integer> {
    void create(Category c);
    void read(Category c);

    void update(String s);
    boolean isPresent(String s);

}
