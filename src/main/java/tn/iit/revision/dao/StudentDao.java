package tn.iit.revision.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.iit.revision.models.Student;
@Repository
public interface StudentDao extends JpaRepository<Student,Long> {
}
