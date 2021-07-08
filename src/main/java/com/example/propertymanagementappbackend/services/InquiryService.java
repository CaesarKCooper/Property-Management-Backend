package com.example.propertymanagementappbackend.services;

import com.example.propertymanagementappbackend.models.Inquiry;
import com.example.propertymanagementappbackend.repositories.InquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InquiryService {

    @Autowired
    InquiryRepository inquiryrepository;

    public void createInquiry(Inquiry inquiry) {
        inquiryrepository.save(inquiry);
    }

        public Iterable<Inquiry> getInquiries() {
        return inquiryrepository.findAll();

    }
    }
