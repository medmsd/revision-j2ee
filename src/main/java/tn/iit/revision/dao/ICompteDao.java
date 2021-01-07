package tn.iit.revision.dao;

import tn.iit.revision.models.Compte;

import java.util.List;

public interface ICompteDao {
    void add(Compte compte);

    void update(Compte compte);

    void delete(Long id);

    Compte findByTeacherId(Long teacherId);

    void deleteCompteByTeacherId(Long teacherId);

    Compte find(Long id);

    List<Compte> findAll();

}
