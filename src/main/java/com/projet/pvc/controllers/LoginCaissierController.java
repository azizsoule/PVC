package com.projet.pvc.controllers;

import com.projet.pvc.entities.Caissier;
import com.projet.pvc.repository.CaissierRepository;
import com.projet.pvc.repository.PvcRepository;
import com.projet.pvc.utils.AlertBox;
import com.projet.pvc.utils.Provider;
import com.projet.pvc.utils.Rooter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class LoginCaissierController implements Initializable {

    @Autowired
    private CaissierRepository caissierRepository;

    @Autowired
    private PvcRepository pvcRepository;

    @FXML
    private AnchorPane window;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    public void connect() {
        Provider.setCaissier(caissierRepository.findCaissierByLoginAndPassword(login.getText(),password.getText()));
        if (Provider.getCaissier() == null) {
            AlertBox.showAlertBox("Erreur", "Login ou mot de passe incorrect !", Alert.AlertType.ERROR);
            login.clear();
            password.clear();
        } else {
            Provider.setPvc(!pvcRepository.findAll().isEmpty() ? pvcRepository.findAll().get(0) : null);
            if (Provider.getPvc() == null) AlertBox.showAlertBox("Erreur", "Aucun PVC disponible dans la base de données !", Alert.AlertType.ERROR);
            else Rooter.goTo(window, "/menu_caissier.fxml");
        }
    }

    public void onExit() {
        Rooter.exitApp(window);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        login.setText("caisse");
        password.setText("caisse");
    }
}
