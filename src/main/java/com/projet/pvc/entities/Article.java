package com.projet.pvc.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "article")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "libelle", nullable = false)
    private String libelle;

    @Column(name = "qt", nullable = false)
    private Integer qt;

    @OneToOne
    @JoinColumn(name = "id_descrip", nullable = false)
    private DescriptionArticle description;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setQt(Integer qt) {
        this.qt = qt;
    }

    public Integer getQt() {
        return qt;
    }

    public DescriptionArticle getDescription() {
        return description;
    }

    public void setDescription(DescriptionArticle description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", qt=" + qt +
                ", description=" + description.getDescription() +
                '}';
    }
}
