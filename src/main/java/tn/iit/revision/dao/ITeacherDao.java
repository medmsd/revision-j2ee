package tn.iit.revision.dao;

import tn.iit.revision.models.Teacher;

import java.util.List;

public interface ITeacherDao {
    void add(Teacher teacher);

    void update(Teacher teacher);

    void delete(Long id);

    Teacher find(Long id);

    List<Teacher> findAll();
}
