package pvc.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginCaissierController {

    @FXML
    AnchorPane window;

    @FXML
    void onExit() {
        Stage stage = (Stage) window.getScene().getWindow();
        stage.close();
    }

}
