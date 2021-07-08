package com.example.propertymanagementappbackend.services;

import com.example.propertymanagementappbackend.models.StudioEfficiency;
import com.example.propertymanagementappbackend.repositories.StudioEfficiencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudioEfficiencyService {

    @Autowired
    StudioEfficiencyRepository studioEfficiencyRepository;

    public Iterable<StudioEfficiency> getAllProperties(){
        return studioEfficiencyRepository.findAll();
    }

    public void createProperty(StudioEfficiency studioefficiency){
        studioEfficiencyRepository.save(studioefficiency);
    }

    public Optional<StudioEfficiency> getStudioEfficiency(Long id){
        return studioEfficiencyRepository.findById(id);
    }
}


