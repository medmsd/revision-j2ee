package tn.iit.revision.daoImpl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tn.iit.revision.dao.ITeacherDao;
import tn.iit.revision.models.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TeacherDao implements ITeacherDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void add(Teacher teacher) {
        this.entityManager.persist (teacher);
        this.entityManager.flush ();
    }
    @Transactional
    @Override
    public void update(Teacher teacher) {
        this.entityManager.merge (teacher);
    }
    @Transactional
    @Override
    public void delete(Long id) {
        this.entityManager.remove (this.find (id));
    }

    @Override
    public Teacher find(Long id) {
        return this.entityManager.find (Teacher.class,id);
    }

    @Override
    public List<Teacher> findAll() {
        return this.entityManager.createNamedQuery ("allTeachers",Teacher.class)
                .getResultList ();
    }
}
