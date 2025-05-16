package com.odanylchuk.storefrontapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "Products")
public class ProductModel {
    @Id
    private UUID Id;
}
