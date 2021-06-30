package com.projet.pvc.controllers;

import com.projet.pvc.entities.Article;
import com.projet.pvc.entities.LigneDeVente;
import com.projet.pvc.entities.Vente;
import com.projet.pvc.repository.ArticleRepository;
import com.projet.pvc.utils.Provider;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
    private Spinner<Integer> spinnerQte;

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

    public void addToCart(ActionEvent event) {
        Article article = comboBoxProduits.getValue();
        if(article != null && article.getDescription() != null){
            LigneDeVente ligneDeVente = new LigneDeVente();
            ligneDeVente.setArticle(article);
            int qte = spinnerQte.getValue();
            ligneDeVente.setQt(qte);
            ligneDeVente.setSousTotal(qte*Integer.parseInt(prix.getText()));
            Vente vente = Provider.getVente();
            vente.getListeLigneDeVente().add(ligneDeVente);
            System.out.println(vente);
            clearField();
        }
    }
    void clearField(){
        comboBoxProduits.setValue(new Article());
        libelleProduit.setText("");
        prix.setText("");
        spinnerQte.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,0,0));
        qteDispo.setText("");
    }

    @FXML
    void annulerVente(ActionEvent event) {

    }

    @FXML
    void terminerVente(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Vente vente = Provider.getVente();
        dateVente.setText(vente.getDate().toString());
        numVente.setText(vente.getId().toString());
        repository.findAll().forEach(article -> {
            comboBoxProduits.getItems().add(article);
        });
        comboBoxProduits.valueProperty().addListener(new ChangeListener<Article>() {
            @Override
            public void changed(ObservableValue<? extends Article> observable, Article oldValue, Article newValue) {
                if(newValue.getDescription() !=null){
                    libelleProduit.setText(newValue.getLibelle());
                    prix.setText(newValue.getDescription().getPrix().toString());
                    spinnerQte.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,Integer.parseInt(newValue.getQt().toString()),1));
                    qteDispo.setText(newValue.getQt().toString());
                }
            }
        });

    }
}