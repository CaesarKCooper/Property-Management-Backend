package com.example.propertymanagementappbackend.repositories;

import java.util.Optional;

import com.example.propertymanagementappbackend.models.ImageModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ImageRepository extends JpaRepository<ImageModel, Long> {
    Optional<ImageModel> findByName(String name);
}
