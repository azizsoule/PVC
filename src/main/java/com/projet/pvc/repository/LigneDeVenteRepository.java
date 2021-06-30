package com.projet.pvc.repository;

import com.projet.pvc.entities.LigneDeVente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LigneDeVenteRepository extends JpaRepository<LigneDeVente, Integer>, JpaSpecificationExecutor<LigneDeVente> {

}