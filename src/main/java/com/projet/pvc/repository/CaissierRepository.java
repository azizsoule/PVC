package com.projet.pvc.repository;

import com.projet.pvc.entities.Caissier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CaissierRepository extends JpaRepository<Caissier, Integer>, JpaSpecificationExecutor<Caissier> {
    boolean existsByLoginAndPassword(String login, String password);
}