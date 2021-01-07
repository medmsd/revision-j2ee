package tn.iit.revision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.iit.revision.dao.IStudentDao;
import tn.iit.revision.daoImpl.StudentDao;
import tn.iit.revision.models.Student;

import java.util.List;

@Service
public class StudentService implements IStudentDao {
    @Autowired
    private StudentDao studentDao;


    @Override
    public void add(Student student) {
        this.studentDao.add (student);
    }

    @Override
    public void update(Student student) {
        this.studentDao.update (student);
    }

    @Override
    public void delete(Long id) {
        this.studentDao.delete (id);
    }

    @Override
    public Student find(Long id) {
        return this.studentDao.find (id);
    }

    @Override
    public List<Student> findAll() {
        return this.studentDao.findAll ();
    }
}
