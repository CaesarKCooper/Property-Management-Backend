package com.example.propertymanagementappbackend.controller;

import com.example.propertymanagementappbackend.models.Apartment;
import com.example.propertymanagementappbackend.models.StudioEfficiency;
import com.example.propertymanagementappbackend.services.ApartmentService;
import com.example.propertymanagementappbackend.services.StudioEfficiencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(path = "/api")
public class ApartmentController {

    @Autowired
    ApartmentService apartmentService;

    @GetMapping("/apartments")
    public Iterable<Apartment> getAllApartments() {
        return apartmentService.getAllProperties();
    }

    @PostMapping("/apartments")
    public void createProperty(@RequestBody Apartment apartment) {
        apartmentService.createProperty(apartment);
    }

    @GetMapping("/apartment/{id}")
    public Optional<Apartment> getApartment(@PathVariable Long id){
        return apartmentService.getApartment(id);
    }
}