package com.projet.pvc.utils;

import com.projet.pvc.entities.Caissier;
import com.projet.pvc.entities.Pvc;
import com.projet.pvc.entities.Vente;

public class Provider {

    private static Caissier caissier;

    private static Pvc pvc;

    private static Vente vente;

    public static Vente getVente() {
        return vente;
    }

    public static void setVente(Vente vente) {
        Provider.vente = vente;
    }

    public static Pvc getPvc() {
        return pvc;
    }

    public static void setPvc(Pvc pvc) {
        Provider.pvc = pvc;
    }

    public static Caissier getCaissier() {
        return caissier;
    }

    public static void setCaissier(Caissier caissier) {
        Provider.caissier = caissier;
    }

}
