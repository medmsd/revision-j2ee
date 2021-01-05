package tn.iit.revision.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.iit.revision.models.Teacher;
@Repository
public interface TeacherDao extends JpaRepository<Teacher,Long> {
}
