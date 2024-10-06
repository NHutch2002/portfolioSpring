package com.example.portfolio.service;

import com.example.portfolio.model.Project;
import com.example.portfolio.model.Reference;
import com.example.portfolio.model.Work;
import com.example.portfolio.repository.ProjectRepository;
import com.example.portfolio.repository.ReferenceRepository;
import com.example.portfolio.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {

    @Autowired
    private ReferenceRepository referenceRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private WorkRepository workRepository;

    public List<Reference> getReferences() {
        return referenceRepository.findAll();
    }

    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

    public List<Work> getWork() {
        return workRepository.findAll();
    }
}
