package tn.iit.revision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.iit.revision.dao.ProjectDao;
import tn.iit.revision.dto.ProjectDto;
import tn.iit.revision.mapper.ProjectMapper;
import tn.iit.revision.models.Project;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectDao projectDao;
    @Transactional
    public void save(ProjectDto projectDto) {
        projectDao.saveAndFlush (ProjectMapper.projectDtoToProject (projectDto));
    }

    public ProjectDto find(Long id) {
        return ProjectMapper.projectToProjectDto (this.projectDao.getOne (id));
    }

    public List<ProjectDto> findAll() {
        return ProjectMapper.projectsToProjectDtos (this.projectDao.findAll ());
    }

    public void delete(Long id) {
        this.projectDao.deleteById (id);
    }

    public List<ProjectDto> findProjectsByTeacherId(Long teacherId) {
        return ProjectMapper.projectsToProjectDtos (this.projectDao.findProjectsByTeacherId (teacherId));
    }
}
