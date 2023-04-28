package com.etudiant.etudiant.controller;

import com.etudiant.etudiant.model.Etudiant;
import com.etudiant.etudiant.repository.EtudiantRepositoryInterface;
import com.etudiant.etudiant.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EtudiantController implements EtudiantControllerInterface{
    @Autowired

    EtudiantService etudiantService;
    private String hello ="tout va bien";
    @Override
    @GetMapping("/afficher")
    public String affiche() {
        //return "tout va bien";
        return hello;
    }

    @PostMapping("/inserer")
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant){

        return etudiantService.saveEtudiant(etudiant);
    }

    @GetMapping("/find")
    public List <Etudiant> afficher(Etudiant etudiant){
        return etudiantService.afficheTout();
    }

    @GetMapping("/findById")
    public List <Etudiant> afficheId(Etudiant etudiant){
        return etudiantService.afficheParId(etudiant.getId());
    }

}
