package com.projet.pvc.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "vente")
public class Vente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "terminee", nullable = false)
    private Integer terminee;

    @OneToMany(mappedBy = "vente", cascade = CascadeType.ALL)
    private List<LigneDeVente> listeLigneDeVente = new ArrayList<>();

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setTerminee(Integer terminee) {
        this.terminee = terminee;
    }

    public Integer getTerminee() {
        return terminee;
    }

    public List<LigneDeVente> getListeLigneDeVente() {
        return listeLigneDeVente;
    }

    public void setListeLigneDeVente(List<LigneDeVente> listeLigneDeVente) {
        this.listeLigneDeVente = listeLigneDeVente;
    }

    @Override
    public String toString() {
        return "Vente{" +
                "id=" + id + '\'' +
                "date=" + date + '\'' +
                "terminee=" + terminee + '\'' +
                '}';
    }
}
