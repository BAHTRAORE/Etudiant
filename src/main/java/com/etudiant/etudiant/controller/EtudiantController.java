package com.etudiant.etudiant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtudiantController implements EtudiantControllerInterface{
    private String hello ="tout va bien";
    @Override
    @GetMapping("/afficher")
    public String affiche() {
        //return "tout va bien";
        return hello;
    }
}
