package com.odanylchuk.storefrontapi.repository;

import com.odanylchuk.storefrontapi.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<OrderModel, UUID> {
}
