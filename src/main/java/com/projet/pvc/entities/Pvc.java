package com.projet.pvc.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pvc")
public class Pvc implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "numero", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numero;

    @Column(name = "solde", nullable = false)
    private Integer solde;

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setSolde(Integer solde) {
        this.solde = solde;
    }

    public Integer getSolde() {
        return solde;
    }

    @Override
    public String toString() {
        return "Pvc{" +
                "numero=" + numero + '\'' +
                "solde=" + solde + '\'' +
                '}';
    }
}
