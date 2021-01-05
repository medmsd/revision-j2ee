package tn.iit.revision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.iit.revision.dao.StudentDao;
import tn.iit.revision.models.Student;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public void save(Student student){
        studentDao.save (student);
    }

    public Student find(Long id){
        return this.studentDao.getOne (id);
    }
    public List<Student> findAll(){
        return this.studentDao.findAll ();
    }
    public void delete(Long id){
        this.studentDao.deleteById (id);
    }
}
