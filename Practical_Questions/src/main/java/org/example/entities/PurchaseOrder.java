package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class PurchaseOrder {
    @Id
    private long id;
    private LocalDate orderDate;
    @ManyToOne
//    @JoinColumn(name="supplier_id")
    private Supplier supplier;
    private double totalAmount;

}
