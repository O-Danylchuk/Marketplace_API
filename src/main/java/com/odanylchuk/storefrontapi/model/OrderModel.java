package com.odanylchuk.storefrontapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "Orders")
public class OrderModel {
    @Id
    private UUID Id;
}
