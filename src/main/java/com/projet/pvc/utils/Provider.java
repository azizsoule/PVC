package com.projet.pvc.utils;

import com.projet.pvc.entities.Caissier;
import com.projet.pvc.entities.Pvc;

public class Provider {

    private static Caissier caissier;

    private static Pvc pvc;

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
