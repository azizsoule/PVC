package com.projet.pvc.controllers;

import com.projet.pvc.repository.CaissierRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
    AnchorPane window;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    public void connect(ActionEvent actionEvent) {
        if(caissierRepository.existsByLoginAndPassword(login.getText(),password.getText())) System.out.println("connecté");
        else System.out.println("non connecté");
    }

    @FXML
    void onExit() {
        Stage stage = (Stage) window.getScene().getWindow();
        stage.close();
    }

}
