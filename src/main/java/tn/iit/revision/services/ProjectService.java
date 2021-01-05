package tn.iit.revision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.iit.revision.dao.ProjectDao;
import tn.iit.revision.models.Project;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectDao projectDao;

    public void save(Project project){
        projectDao.save (project);
    }

    public Project find(Long id){
        return this.projectDao.getOne (id);
    }
    public List<Project> findAll(){
        return this.projectDao.findAll ();
    }
    public void delete(Long id){
        this.projectDao.deleteById (id);
    }
    public List<Project> findProjectsByTeacherId(Long teacherId){
        return this.projectDao.findProjectsByTeacherId (teacherId);
    }
}
