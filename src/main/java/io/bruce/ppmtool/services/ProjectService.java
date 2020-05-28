package io.bruce.ppmtool.services;

import io.bruce.ppmtool.domain.Project;
import io.bruce.ppmtool.repositories.ProjectRepository;
import org.bruce.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){

        //Logic

        return projectRepository.save(project);
    }

}
