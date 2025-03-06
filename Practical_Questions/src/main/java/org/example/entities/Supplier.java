package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity

public class Supplier {
    @Id
    private int id;

    private String name;
    private int contactInfo;
}
