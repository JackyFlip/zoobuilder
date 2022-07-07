package org.example.zoo;

import java.util.List;

public class Zoo {

    private String nom;
    private List<Zone> zones;

    public Zoo(String nom, List<Zone> zones) {
        this.nom = nom;
        this.zones = zones;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "nom='" + nom + '\'' +
                ", zones=" + zones +
                '}';
    }
}
