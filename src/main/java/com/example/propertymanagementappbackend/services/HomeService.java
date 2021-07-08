package com.example.propertymanagementappbackend.services;

import com.example.propertymanagementappbackend.models.Home;
import com.example.propertymanagementappbackend.models.StudioEfficiency;
import com.example.propertymanagementappbackend.repositories.HomeRepository;
import com.example.propertymanagementappbackend.repositories.StudioEfficiencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HomeService {

    @Autowired
    HomeRepository homeRepository;

    public Iterable<Home> getAllProperties(){
        return homeRepository.findAll();
    }

    public void createProperty(Home home){
        homeRepository.save(home);
    }

    public Optional<Home> getHome(Long id){
        return homeRepository.findById(id);
    }
}
