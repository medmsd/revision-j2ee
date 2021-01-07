package tn.iit.revision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.iit.revision.dao.StudentDao;
import tn.iit.revision.dto.StudentDto;
import tn.iit.revision.mapper.StudentMapper;
import tn.iit.revision.models.Student;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    @Transactional
    public void save(StudentDto studentDto){
        studentDao.saveAndFlush (StudentMapper.studentDtoToStudent (studentDto));
    }

    public StudentDto find(Long id){
        return StudentMapper.studentToStudentDto (this.studentDao.getOne (id));
    }
    public List<StudentDto> findAll(){
        return StudentMapper.studentsToStudentDtos (this.studentDao.findAll ());
    }
    public void delete(Long id){
        this.studentDao.deleteById (id);
    }
}
