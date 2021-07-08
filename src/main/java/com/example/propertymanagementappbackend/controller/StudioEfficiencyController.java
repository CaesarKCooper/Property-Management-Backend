package com.example.propertymanagementappbackend.controller;

import com.example.propertymanagementappbackend.models.StudioEfficiency;
import com.example.propertymanagementappbackend.services.StudioEfficiencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.Optional;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(path = "/api")
public class StudioEfficiencyController {

    @Autowired
    StudioEfficiencyService studioEfficiencyService;

    @GetMapping("/studioefficiencies")
    public Iterable<StudioEfficiency> getAllStudioEfficiency() {
        return studioEfficiencyService.getAllProperties();
    }

    @PostMapping("/studioefficiencies")
    public void createProperty(@RequestBody StudioEfficiency studioefficiency){
        studioEfficiencyService.createProperty(studioefficiency);
    }

    @GetMapping("/studioefficiency/{id}")
    public Optional<StudioEfficiency> getStudioEfficiency(@PathVariable Long id){
        return studioEfficiencyService.getStudioEfficiency(id);
    }
}