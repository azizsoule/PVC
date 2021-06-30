package com.projet.pvc.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "manager")
public class Manager implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private Integer password;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Integer getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id + '\'' +
                "nom=" + nom + '\'' +
                "login=" + login + '\'' +
                "password=" + password + '\'' +
                '}';
    }
}
