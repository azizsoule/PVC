package com.projet.pvc.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

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

    @Override
    public String toString() {
        return "Vente{" +
                "id=" + id + '\'' +
                "date=" + date + '\'' +
                "terminee=" + terminee + '\'' +
                '}';
    }
}
