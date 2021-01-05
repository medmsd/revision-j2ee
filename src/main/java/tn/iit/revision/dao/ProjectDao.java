package tn.iit.revision.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.iit.revision.models.Project;
import java.util.List;

@Repository
public interface ProjectDao extends JpaRepository<Project,Long> {
    List<Project> findProjectsByTeacherId(long teacher_id);

    void deleteProjectsByTeacherId(long teacher_id);
}
