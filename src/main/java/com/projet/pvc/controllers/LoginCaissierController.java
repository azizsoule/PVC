package com.projet.pvc.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;

@Component
public class LoginCaissierController {

    @FXML
    AnchorPane window;

    @FXML
    void onExit() {
        Stage stage = (Stage) window.getScene().getWindow();
        stage.close();
    }

}
