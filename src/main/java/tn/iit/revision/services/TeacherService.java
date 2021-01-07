package tn.iit.revision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.iit.revision.dao.CompteDao;
import tn.iit.revision.dao.ProjectDao;
import tn.iit.revision.dao.TeacherDao;
import tn.iit.revision.dto.TeacherDto;
import tn.iit.revision.mapper.TeacherMapper;
import tn.iit.revision.models.Teacher;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherDao teacherDao;
    @Autowired
    private CompteDao compteDao;
    @Autowired
    private ProjectDao projectDao;

    @Transactional
    public void save(TeacherDto teacherDto) {
        teacherDao.saveAndFlush (TeacherMapper.teacherDtoToTeacher (teacherDto));
    }

    public TeacherDto find(long id) {
        return TeacherMapper.teacherToTeacherDto (this.teacherDao.getOne (id));
    }

    public List<TeacherDto> findAll() {
        return TeacherMapper.teachersToTeacherDtos (this.teacherDao.findAll ());
    }

    @Transactional
    public void delete(long id) {
        this.compteDao.deleteComptesByTeacherId (id);
        this.projectDao.deleteProjectsByTeacherId (id);
        this.teacherDao.deleteById (id);
    }
}
