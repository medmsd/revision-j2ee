package tn.iit.revision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.iit.revision.dao.ITeacherDao;
import tn.iit.revision.daoImpl.CompteDao;
import tn.iit.revision.daoImpl.ProjectDao;
import tn.iit.revision.daoImpl.TeacherDao;
import tn.iit.revision.models.Teacher;

import java.util.List;

@Service
public class TeacherService implements ITeacherDao {
    @Autowired
    private TeacherDao teacherDao;
    @Autowired
    private CompteDao compteDao;
    @Autowired
    private ProjectDao projectDao;

    @Override
    public void add(Teacher teacher) {
        this.teacherDao.add (teacher);
    }

    @Override
    public void update(Teacher teacher) {
        this.teacherDao.update (teacher);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        this.compteDao.deleteCompteByTeacherId (id);
        this.projectDao.deleteProjectsByTeacherId (id);
        this.teacherDao.delete (id);
    }

    @Override
    public Teacher find(Long id) {
        return this.teacherDao.find (id);
    }

    @Override
    public List<Teacher> findAll() {
        return this.teacherDao.findAll ();
    }
}
