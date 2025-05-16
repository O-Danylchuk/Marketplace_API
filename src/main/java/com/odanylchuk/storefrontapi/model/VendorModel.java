package com.odanylchuk.storefrontapi.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Vendors")
public class VendorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID vendorId;
}
