package com.example.portfolio.controller;

import com.example.portfolio.model.Project;
import com.example.portfolio.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

    private PortfolioService portfolioService;

    @Autowired
    public ProjectController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/projects")
    public List<Project> getProjects(){
        return portfolioService.getProjects();
    }
}
