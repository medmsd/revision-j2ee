package tn.iit.revision.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.iit.revision.dao.CompteDao;
import tn.iit.revision.dto.CompteDto;
import tn.iit.revision.mapper.CompteMapper;
import tn.iit.revision.models.Compte;

import java.util.List;

@Service
public class CompteService {
    @Autowired
    private CompteDao compteDao;
    @Transactional
    public void save(CompteDto compteDto) {
        compteDao.saveAndFlush (CompteMapper.compteDtoToCompte (compteDto));
    }

    public CompteDto find(Long id) {
        return CompteMapper.compteToCompteDto (this.compteDao.getOne (id));
    }

    public List<CompteDto> findAll() {
        return CompteMapper.comptesToCompteDtos (this.compteDao.findAll ());
    }

    public void delete(Long id) {
        this.compteDao.deleteById (id);
    }

    public CompteDto findByTeacherId(Long teacherId) {
        return CompteMapper.compteToCompteDto (this.compteDao.findCompteByTeacherId (teacherId));
    }

}
