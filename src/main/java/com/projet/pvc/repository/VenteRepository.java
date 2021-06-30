package com.projet.pvc.repository;

import com.projet.pvc.entities.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VenteRepository extends JpaRepository<Vente, Integer>, JpaSpecificationExecutor<Vente> {

}