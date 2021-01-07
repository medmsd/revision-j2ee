package tn.iit.revision.dao;

import tn.iit.revision.models.Student;

import java.util.List;

public interface IStudentDao {
    void add(Student student);

    void update(Student student);

    void delete(Long id);

    Student find(Long id);
    List<Student> findAll();
}
