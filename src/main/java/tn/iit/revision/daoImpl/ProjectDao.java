package tn.iit.revision.daoImpl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tn.iit.revision.dao.IProjectDao;
import tn.iit.revision.models.Project;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ProjectDao implements IProjectDao {

    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    @Override
    public void add(Project project) {
        this.entityManager.persist (project);
        this.entityManager.flush ();
    }
    @Transactional
    @Override
    public void update(Project project) {
        this.entityManager.merge (project);
    }
    @Transactional
    @Override
    public void delete(Long id) {
        this.entityManager.remove (this.find (id));
    }

    @Override
    public Project find(Long id) {
        return this.entityManager.find (Project.class, id);
    }

    @Override
    public List<Project> findAll() {
        return this.entityManager.createNamedQuery ("allProjects", Project.class)
                .getResultList ();
    }

    @Override
    public List<Project> findProjectsByTeacherId(Long teacherId) {
        return this.entityManager.createNamedQuery ("findProjectsByTeacherId", Project.class)
                .setParameter ("id", teacherId).getResultList ();
    }
    @Transactional
    @Override
    public void deleteProjectsByTeacherId(Long teacherId) {
        this.entityManager.createNamedQuery ("deleteProjectsByTeacherId")
                .setParameter ("id", teacherId).executeUpdate ();
    }
}
