package com.projet.pvc.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ligne_de_vente")
public class LigneDeVente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "qt", nullable = false)
    private Integer qt;

    @Column(name = "sous_total", nullable = false)
    private Integer sousTotal;

    @ManyToOne
    @JoinColumn(name = "id_descrip", nullable = false)
    private DescriptionArticle description;

    @ManyToOne
    @JoinColumn(name = "id_vente", nullable = false)
    private Vente vente;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setQt(Integer qt) {
        this.qt = qt;
    }

    public Integer getQt() {
        return qt;
    }

    public void setSousTotal(Integer sousTotal) {
        this.sousTotal = sousTotal;
    }

    public Integer getSousTotal() {
        return sousTotal;
    }

    public DescriptionArticle getDescription() {
        return description;
    }

    public void setDescription(DescriptionArticle description) {
        this.description = description;
    }

    public Vente getVente() {
        return vente;
    }

    public void setVente(Vente vente) {
        this.vente = vente;
    }

    @Override
    public String toString() {
        return "LigneDeVente{" +
                "id=" + id +
                ", qt=" + qt +
                ", sousTotal=" + sousTotal +
                ", description=" + description +
                ", vente=" + vente.getId() +
                '}';
    }
}
