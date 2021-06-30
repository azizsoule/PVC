package com.projet.pvc.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class AlertBox {

    public static void showAlertBox(String title, String message, Alert.AlertType alertType) {
        Alert alertBox = new Alert(alertType);
        alertBox.setTitle(title);
        alertBox.setContentText(message);
        alertBox.showAndWait().ifPresent(
                pressedButton -> {
                    if (pressedButton == ButtonType.OK) {
                        alertBox.close();
                    }
                }
        );
    }

    public static void showAlertBox(String title, String message, Function whenOk) {
        Alert alertBox = new Alert(Alert.AlertType.CONFIRMATION);
        alertBox.setTitle(title);
        alertBox.setContentText(message);
        alertBox.showAndWait().ifPresent(
                pressedButton -> {
                    if (pressedButton == ButtonType.OK) {
                        whenOk.apply();
                    }else {
                        alertBox.close();
                    }
                }
        );
    }

}

interface Function {

    void apply();

}
