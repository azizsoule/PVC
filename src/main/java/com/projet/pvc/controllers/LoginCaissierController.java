package com.projet.pvc.controllers;

import com.projet.pvc.entities.Caissier;
import com.projet.pvc.repository.CaissierRepository;
import com.projet.pvc.utils.AlertBox;
import com.projet.pvc.utils.Provider;
import com.projet.pvc.utils.Rooter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class LoginCaissierController {

    @Autowired
    private CaissierRepository caissierRepository;

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
        } else Rooter.goTo(window, "/menu_caissier.fxml");
    }

    public void onExit() {
        Rooter.exitApp(window);
    }

}
