package com.etudiant.etudiant.service;

import com.etudiant.etudiant.model.Etudiant;
import com.etudiant.etudiant.repository.EtudiantRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepositoryInterface etudiantRepositoryInterface ;
    public Etudiant saveEtudiant(Etudiant etudiant){
        return etudiantRepositoryInterface.save(etudiant);
    }

    public List<Etudiant> afficheTout(){
        return etudiantRepositoryInterface.findAll();
    }

    public List<Etudiant> afficheParId(long id){
        return etudiantRepositoryInterface.findById(id);
    }

}


