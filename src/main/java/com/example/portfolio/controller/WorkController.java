package com.example.portfolio.controller;

import com.example.portfolio.model.Work;
import com.example.portfolio.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkController {

    private PortfolioService portfolioService;

    @Autowired
    public WorkController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/work")
    public List<Work> getWork() {
        return portfolioService.getWork();
    }

}
