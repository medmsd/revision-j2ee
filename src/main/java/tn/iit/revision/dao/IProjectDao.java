package tn.iit.revision.dao;

import tn.iit.revision.models.Project;

import java.util.List;

public interface IProjectDao {
    void add(Project project);

    void update(Project project);

    void delete(Long id);

    Project find(Long id);

    List<Project> findAll();

    List<Project> findProjectsByTeacherId(Long teacherId);

    void deleteProjectsByTeacherId(Long teacherId);

}
