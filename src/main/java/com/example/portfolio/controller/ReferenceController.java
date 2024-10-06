package com.example.portfolio.controller;

import com.example.portfolio.model.Reference;
import com.example.portfolio.repository.ReferenceRepository;
import com.example.portfolio.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReferenceController {

    private PortfolioService portfolioService;

    @Autowired
    public ReferenceController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/references")
    public List<Reference> getReferences() {
        return portfolioService.getReferences();
    }

}
