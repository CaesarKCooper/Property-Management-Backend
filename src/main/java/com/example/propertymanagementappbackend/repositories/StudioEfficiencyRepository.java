package com.example.propertymanagementappbackend.repositories;

import com.example.propertymanagementappbackend.models.StudioEfficiency;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudioEfficiencyRepository extends CrudRepository<StudioEfficiency, Long> {


}
