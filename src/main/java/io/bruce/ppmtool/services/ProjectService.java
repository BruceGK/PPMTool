package io.bruce.ppmtool.services;

import io.bruce.ppmtool.domain.Project;
import io.bruce.ppmtool.exceptions.ProjectIdException;
import io.bruce.ppmtool.repositories.ProjectRepository;
import org.bruce.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {

        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);
        } catch (Exception e) {
            throw new ProjectIdException("Project ID '" + project.getProjectIdentifier().toUpperCase() + "' already exists");
        }
    }

}
