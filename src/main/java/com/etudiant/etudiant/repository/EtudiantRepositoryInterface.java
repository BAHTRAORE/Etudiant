package com.etudiant.etudiant.repository;

import com.etudiant.etudiant.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepositoryInterface extends JpaRepository<Etudiant, Long> {

}
