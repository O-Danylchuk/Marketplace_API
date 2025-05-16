package com.odanylchuk.storefrontapi.repository;

import com.odanylchuk.storefrontapi.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
