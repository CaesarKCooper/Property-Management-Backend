package com.example.propertymanagementappbackend.controller;

import com.example.propertymanagementappbackend.models.Home;
import com.example.propertymanagementappbackend.models.StudioEfficiency;
import com.example.propertymanagementappbackend.services.HomeService;
import com.example.propertymanagementappbackend.services.StudioEfficiencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(path = "/api")
public class HomeController {

    @Autowired
    HomeService homeService;

    @GetMapping("/homes")
    public Iterable<Home> getAllHomes() {
        return homeService.getAllProperties();
    }

    @PostMapping("/homes")
    public void createProperty(@RequestBody Home home) {
        homeService.createProperty(home);
    }

    @GetMapping("/home/{id}")
    public Optional<Home> getHome(@PathVariable Long id){
        return homeService.getHome(id);
    }
}