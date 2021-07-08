package com.example.propertymanagementappbackend.controller;

import com.example.propertymanagementappbackend.models.Apartment;
import com.example.propertymanagementappbackend.models.Inquiry;
import com.example.propertymanagementappbackend.services.ApartmentService;
import com.example.propertymanagementappbackend.services.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(path = "/api")
public class InquiryController {

    @Autowired
    InquiryService inquiryService;

    @PostMapping("/inquiry")
    public void createProperty(@RequestBody Inquiry inquiry) {
        inquiryService.createInquiry(inquiry);
    }

    @GetMapping("/inquiry")
    public Iterable<Inquiry> getAllInquires() {
        return inquiryService.getInquiries();
    }

}
