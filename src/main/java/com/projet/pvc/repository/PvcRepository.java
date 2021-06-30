package com.projet.pvc.repository;

import com.projet.pvc.entities.Pvc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PvcRepository extends JpaRepository<Pvc, Integer>, JpaSpecificationExecutor<Pvc> {

}