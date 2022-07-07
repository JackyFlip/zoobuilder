package org.example.zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zone {

    private String nom;
    private Integer capacite;
    private List<Animal> animals;

    public Zone(String nom, Integer capacite) {
        this.nom = nom;
        this.capacite = capacite;
        this.animals = new ArrayList<Animal>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    /* Ajout d'un animal à la liste d'animaux de la classe */
    public void appendAnimal(Animal animal) {
        // Vérification de la capacité
        if (animals.size() >= capacite) {
            throw new IllegalStateException("La capacité maximale de la zone '" + nom + "' est atteinte !");
        }
        // Ajout de l'animal à la liste
        animals.add(animal);
    }

    @Override
    public String toString() {
        return "Zone{" +
                "nom='" + nom + '\'' +
                ", capacite=" + capacite +
                ", animals=" + animals +
                '}';
    }
}
