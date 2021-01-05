package tn.iit.revision.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.iit.revision.models.Compte;

@Repository
public interface CompteDao extends JpaRepository<Compte,Long> {
    Compte findCompteByTeacherId(long teacher_id);

    void deleteComptesByTeacherId(long teacher_id);
}
