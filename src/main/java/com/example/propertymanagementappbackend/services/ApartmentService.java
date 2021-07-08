package com.example.propertymanagementappbackend.services;

import com.example.propertymanagementappbackend.models.Apartment;
import com.example.propertymanagementappbackend.models.StudioEfficiency;
import com.example.propertymanagementappbackend.repositories.ApartmentRepository;
import com.example.propertymanagementappbackend.repositories.StudioEfficiencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApartmentService {

    @Autowired
    ApartmentRepository apartmentRepository;

    public Iterable<Apartment> getAllProperties(){
        return apartmentRepository.findAll();
    }

    public void createProperty(Apartment apartment){
        apartmentRepository.save(apartment);
    }

    public Optional<Apartment> getApartment(Long id){
        return apartmentRepository.findById(id);
    }
}
