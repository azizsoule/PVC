package com.projet.pvc.repository;

import com.projet.pvc.entities.DescriptionArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DescriptionArticleRepository extends JpaRepository<DescriptionArticle, Integer>, JpaSpecificationExecutor<DescriptionArticle> {

}