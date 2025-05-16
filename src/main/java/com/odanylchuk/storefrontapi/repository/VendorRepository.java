package com.odanylchuk.storefrontapi.repository;

import com.odanylchuk.storefrontapi.model.VendorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VendorRepository extends JpaRepository<VendorModel, UUID> {
}
