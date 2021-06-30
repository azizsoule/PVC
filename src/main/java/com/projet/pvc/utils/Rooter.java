package com.projet.pvc.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Rooter {
    private static ApplicationContext applicationContext;
    public static final String windowTitle = "PVC";

    public Rooter(ApplicationContext applicationContext) {
        Rooter.applicationContext = applicationContext;
    }

    public static void goTo(Pane currentPane, String fxmlFile) {
        Stage stage = (Stage) currentPane.getScene().getWindow();
        stage.close();
        FXMLLoader loader = new FXMLLoader(Rooter.class.getResource(fxmlFile));
        loader.setControllerFactory(applicationContext::getBean);
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
