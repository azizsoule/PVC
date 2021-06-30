package com.projet.pvc.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "description_article")
public class DescriptionArticle implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cpu", nullable = false)
    private String cpu;

    @Column(name = "prix", nullable = false)
    private Integer prix;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToOne(mappedBy = "description")
    private Article article;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }



    @Override
    public String toString() {
        return "DescriptionArticle{" +
                "id=" + id +
                ", cpu='" + cpu + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", article=" + article.getLibelle() +
                '}';
    }
}
