package org.example.builder;

import org.example.zoo.Animal;
import org.example.zoo.Zone;
import org.example.zoo.Zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZooBuilder {

    private String nom;
    private List<Zone> zones;

    public ZooBuilder(String nom) {
        this.nom = nom;
        this.zones = new ArrayList<Zone>();
    }

    /* Ajout d'une nouvelle zone au zoo */
    public void appendZone(String nom, Integer capacite) {
        this.zones.add(new Zone(nom, capacite));
    }

    /* Ajout d'un nouvel animal dans une zone donnée du zoo */
    public void appendAnimal(String nomZone, Animal animal) {
        for (int i = 0; i < this.zones.size(); i++) {

            Zone zone = zones.get(i);

            if(zone.getNom().equals(nomZone)) {

                if(zone.getAnimals().size() >= zone.getCapacite()) {
                    throw new IllegalStateException("La capacité maximale de la zone est atteinte !");
                }

                List<Animal> animals = zone.getAnimals();
                animals.add(animal);
                zone.setAnimals(animals);

                break;
            }
        }
    }

    /* Version courte de l'ajout d'un animal en passant par une méthode supplémentaire du côté de la classe Zone */
    public void appendAnimalv2(String nomZone, Animal animal) {

        // Recherche de l'index correspondant au nom de zone donné en paramètre
        Integer index = zones.stream().map(zone -> zone.getNom().equals(nomZone)).toList().indexOf(true);

        // Un index de -1 signifie que le nom de zone n'a pas été trouvé dans la liste
        if (index.equals(-1)) {
            throw new IllegalStateException("Le nom de zone '" + nomZone + "' n'existe pas !");
        }

        // Ajout de l'animal dans la zone voulue
        zones.get(index).appendAnimal(animal);
    }

    /* Récupération du zoo */
    public Zoo get(){
        return new Zoo(nom, zones);
    }

}
