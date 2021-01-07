package tn.iit.revision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.iit.revision.dao.IProjectDao;
import tn.iit.revision.daoImpl.ProjectDao;
import tn.iit.revision.models.Project;

import java.util.List;

@Service
public class ProjectService implements IProjectDao {
    @Autowired
    private ProjectDao projectDao;

    @Transactional
    @Override
    public void add(Project project) {
        this.projectDao.add (project);
    }

    @Override
    public void update(Project project) {
        this.projectDao.update (project);
    }

    @Override
    public void delete(Long id) {
        this.projectDao.delete (id);
    }

    @Override
    public Project find(Long id) {
        return this.projectDao.find (id);
    }

    @Override
    public List<Project> findAll() {
        return this.projectDao.findAll ();
    }

    @Override
    public List<Project> findProjectsByTeacherId(Long teacherId) {
        return this.projectDao.findProjectsByTeacherId (teacherId);
    }

    @Override
    public void deleteProjectsByTeacherId(Long teacherId) {
        this.projectDao.deleteProjectsByTeacherId (teacherId);
    }
}
