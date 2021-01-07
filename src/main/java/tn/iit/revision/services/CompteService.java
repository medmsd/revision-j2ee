package tn.iit.revision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.iit.revision.dao.ICompteDao;
import tn.iit.revision.daoImpl.CompteDao;
import tn.iit.revision.models.Compte;

import java.util.List;

@Service
public class CompteService implements ICompteDao {
    @Autowired
    private CompteDao compteDao;


    @Override
    public void add(Compte compte) {
        this.compteDao.add (compte);
    }

    @Override
    public void update(Compte compte) {
        this.compteDao.update (compte);
    }

    @Override
    public void delete(Long id) {
        this.compteDao.delete (id);
    }

    @Override
    public Compte findByTeacherId(Long teacherId) {
        return this.compteDao.findByTeacherId (teacherId);
    }

    @Override
    public void deleteCompteByTeacherId(Long teacherId) {
        this.compteDao.deleteCompteByTeacherId (teacherId);
    }

    @Override
    public Compte find(Long id) {
        return this.compteDao.find (id);
    }

    @Override
    public List<Compte> findAll() {
        return this.compteDao.findAll ();
    }
}
