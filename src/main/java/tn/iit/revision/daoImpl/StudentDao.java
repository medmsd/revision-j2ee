package tn.iit.revision.daoImpl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tn.iit.revision.dao.IStudentDao;
import tn.iit.revision.models.Student;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class StudentDao implements IStudentDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    @Override
    public void add(Student student) {
        this.entityManager.persist (student);
        this.entityManager.flush ();
    }
    @Transactional
    @Override
    public void update(Student student) {
        this.entityManager.merge (student);
    }
    @Transactional
    @Override
    public void delete(Long id) {
        this.entityManager.remove (this.find (id));
    }

    @Override
    public Student find(Long id) {
        return this.entityManager.find (Student.class,id);
    }

    @Override
    public List<Student> findAll() {
        return this.entityManager.createNamedQuery ("allStudents",Student.class)
                .getResultList ();
    }
}
