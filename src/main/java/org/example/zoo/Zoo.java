package org.example.zoo;

import java.util.List;

public class Zoo {

    private String nom;
    private List<Zone> zones;

    public Zoo(String nom, List<Zone> zones) {
        this.nom = nom;
        this.zones = zones;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Zone> getZones() {
        return zones;
    }

    public void setZones(List<Zone> zones) {
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
