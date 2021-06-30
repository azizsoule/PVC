package com.projet.pvc.controllers;

import com.projet.pvc.entities.Article;
import com.projet.pvc.repository.ArticleRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class VenteController implements Initializable {

    @Autowired
    private ArticleRepository repository;

    @FXML
    private TextField dateVente;

    @FXML
    private TextField numVente;

    @FXML
    private ComboBox<Article> comboBoxProduits;

    @FXML
    private TextField libelleProduit;

    @FXML
    private TextField prix;

    @FXML
    private Spinner<?> spinnerQte;

    @FXML
    private TextField qteDispo;

    @FXML
    private Button btnAddToCart;

    @FXML
    private TableView<?> listeProduits;

    @FXML
    private TextField total;

    @FXML
    private TextField paye;

    @FXML
    private TextField rendu;

    @FXML
    private Button btnTerminerVente;

    @FXML
    private Button btnAnnuler;

    @FXML
    void addToCart(ActionEvent event) {

    }

    @FXML
    void annulerVente(ActionEvent event) {

    }

    @FXML
    void terminerVente(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        repository.findAll().forEach(article -> {
            comboBoxProduits.setValue(article);
        });
    }
}