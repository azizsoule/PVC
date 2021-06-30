package com.projet.pvc.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;

public class Rooter {

    public static final String windowTitle = "PVC";

    public static void goTo(Pane currentPane, String fxmlFile) {
        Stage stage = (Stage) currentPane.getScene().getWindow();
        stage.close();
        FXMLLoader loader = new FXMLLoader(Rooter.class.getResource(fxmlFile));
        Parent root = null;
        try {
            root = loader.load();
            stage.setTitle(windowTitle);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void exitApp(Pane currentPane) {
        Stage stage = (Stage) currentPane.getScene().getWindow();
        stage.close();
    }

}
