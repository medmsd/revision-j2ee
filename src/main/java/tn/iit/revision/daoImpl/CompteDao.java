package tn.iit.revision.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tn.iit.revision.dao.ICompteDao;
import tn.iit.revision.models.Compte;

import javax.persistence.*;
import java.util.List;

@Repository
public class CompteDao implements ICompteDao {

    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    @Override
    public void add(Compte compte) {
        this.entityManager.persist (compte);
        this.entityManager.flush ();
    }
    @Transactional
    @Override
    public void update(Compte compte) {
        this.entityManager.merge (compte);
    }
    @Transactional
    @Override
    public void delete(Long id) {
        this.entityManager.remove (this.find (id));
    }

    @Override
    public Compte findByTeacherId(Long teacherId) {
        return this.entityManager.createNamedQuery ("findComptesByTeacherId", Compte.class)
                .setParameter ("id", teacherId)
                .getSingleResult ();

    }
    @Transactional
    @Override
    public void deleteCompteByTeacherId(Long teacherId) {
        this.entityManager.createNamedQuery ("deleteCompteByTeacherId")
                .setParameter ("id", teacherId).executeUpdate ();

    }

    @Override
    public Compte find(Long id) {
        return this.entityManager.find (Compte.class,id);
    }

    @Override
    public List<Compte> findAll() {
        return this.entityManager.createNamedQuery ("allComptes",Compte.class)
                .getResultList ();
    }
}
