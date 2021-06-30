package com.projet.pvc.tableview_models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Button;

public class LigneDeVenteTableView {

    private SimpleStringProperty cpu;
    private SimpleStringProperty libelle;
    private SimpleIntegerProperty prix;
    private SimpleIntegerProperty quantite;
    private SimpleIntegerProperty sousTotal;
    private SimpleObjectProperty<Button> deleteButton;

    public LigneDeVenteTableView(String c, String lib, Integer pr, Integer qt, Integer st, Button delete) {
        cpu = new SimpleStringProperty(c);
        libelle = new SimpleStringProperty(lib);
        prix = new SimpleIntegerProperty(pr);
        quantite = new SimpleIntegerProperty(qt);
        sousTotal = new SimpleIntegerProperty(st);
        deleteButton = new SimpleObjectProperty<>(delete);
    }

    public String getCpu() {
        return cpu.get();
    }

    public SimpleStringProperty cpuProperty() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu.set(cpu);
    }

    public String getLibelle() {
        return libelle.get();
    }

    public SimpleStringProperty libelleProperty() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle.set(libelle);
    }

    public int getPrix() {
        return prix.get();
    }

    public SimpleIntegerProperty prixProperty() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix.set(prix);
    }

    public int getQuantite() {
        return quantite.get();
    }

    public SimpleIntegerProperty quantiteProperty() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite.set(quantite);
    }

    public int getSousTotal() {
        return sousTotal.get();
    }

    public SimpleIntegerProperty sousTotalProperty() {
        return sousTotal;
    }

    public void setSousTotal(int sousTotal) {
        this.sousTotal.set(sousTotal);
    }

    public Button getDeleteButton() {
        return deleteButton.get();
    }

    public SimpleObjectProperty<Button> deleteButtonProperty() {
        return deleteButton;
    }

    public void setDeleteButton(Button deleteButton) {
        this.deleteButton.set(deleteButton);
    }
}
