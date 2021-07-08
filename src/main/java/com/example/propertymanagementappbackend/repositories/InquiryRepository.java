package com.example.propertymanagementappbackend.repositories;

import com.example.propertymanagementappbackend.models.Inquiry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquiryRepository extends CrudRepository<Inquiry, Long> {
}
