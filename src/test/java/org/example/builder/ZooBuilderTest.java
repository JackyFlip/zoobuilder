package org.example.builder;

import org.example.zoo.Animal;
import org.example.zoo.Zone;
import org.example.zoo.Zoo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooBuilderTest {

    @Test
    void testBuilder() {
        String nomZoo = "Amneville";

        // Préparation de la liste d'animaux
        String nomAnimal = "panda";
        Animal panda = new Animal("panda");
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(panda);

        // Prépatration de la liste de zones
        String nomZone = "Zone 51";
        Integer nbCapacite = 51;
        Zone zone51 = new Zone(nomZone, nbCapacite);

        // Instance du builder de zoo
        ZooBuilder zooAmnevilleBuilder = new ZooBuilder(nomZoo);

        // Ajout d'une zone et d'un animal
        zooAmnevilleBuilder.appendZone(nomZone, nbCapacite);
        zooAmnevilleBuilder.appendAnimal(nomZone, panda);

        // Récupération du zoo
        Zoo zooAmneville = zooAmnevilleBuilder.get();

        // Tests
        assertEquals(zooAmneville.getNom(), nomZoo);
        assertEquals(zooAmneville.getZones().get(0).getNom(), nomZone);
        assertEquals(zooAmneville.getZones().get(0).getCapacite(), nbCapacite);
        assertEquals(zooAmneville.getZones().get(0).getAnimals(), animals);

    }
}