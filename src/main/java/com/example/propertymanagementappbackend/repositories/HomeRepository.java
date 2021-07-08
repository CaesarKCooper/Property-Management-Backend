package com.example.propertymanagementappbackend.repositories;

import com.example.propertymanagementappbackend.models.Home;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends CrudRepository<Home, Long> {
}
