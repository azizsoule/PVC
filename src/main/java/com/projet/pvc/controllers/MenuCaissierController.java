package com.projet.pvc.controllers;

import com.projet.pvc.entities.Vente;
import com.projet.pvc.repository.ArticleRepository;
import com.projet.pvc.repository.VenteRepository;
import com.projet.pvc.utils.Provider;
import com.projet.pvc.utils.Rooter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MenuCaissierController {
    @Autowired
    private VenteRepository venteRepository;

    @FXML
    AnchorPane window;

    public void onExit() {
        Rooter.exitApp(window);
    }

    public void onNewVente(ActionEvent actionEvent) {
        Vente vente = new Vente();
        vente.setDate(new Date());
        vente.setTerminee(0);
        Provider.setVente(venteRepository.save(vente));
        Rooter.goTo(window, "/vente.fxml");
    }
}
