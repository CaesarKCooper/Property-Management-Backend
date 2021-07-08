package com.example.propertymanagementappbackend.repositories;

import com.example.propertymanagementappbackend.models.Apartment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentRepository extends CrudRepository<Apartment, Long> {
}
