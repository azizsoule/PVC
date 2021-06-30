package com.projet.pvc.entities;

import javax.persistence.*;
import java.io.Serializable;

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

    @Column(name = "id_article", nullable = false)
    private Integer idArticle;

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

    public void setIdArticle(Integer idArticle) {
        this.idArticle = idArticle;
    }

    public Integer getIdArticle() {
        return idArticle;
    }

    @Override
    public String toString() {
        return "DescriptionArticle{" +
                "id=" + id + '\'' +
                "cpu=" + cpu + '\'' +
                "prix=" + prix + '\'' +
                "description=" + description + '\'' +
                "idArticle=" + idArticle + '\'' +
                '}';
    }
}
