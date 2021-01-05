package tn.iit.revision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.iit.revision.dao.CompteDao;
import tn.iit.revision.models.Compte;

import java.util.List;

@Service
public class CompteService {
    @Autowired
    private CompteDao compteDao;

    public void save(Compte compte){
        compteDao.save (compte);
    }

    public Compte find(Long id){
        return this.compteDao.getOne (id);
    }
    public List<Compte> findAll(){
        return this.compteDao.findAll ();
    }
    public void delete(Long id){
        this.compteDao.deleteById (id);
    }
    public Compte findByTeacherId(Long teacherId){
        return this.compteDao.findCompteByTeacherId (teacherId);
    }

}
