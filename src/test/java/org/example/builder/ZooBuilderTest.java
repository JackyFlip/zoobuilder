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

        String nomAnimal = "panda";
        Animal panda = new Animal("panda");
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(panda);

        String nomZone = "Zone 51";
        Integer nbCapacite = 51;
        Zone zone51 = new Zone(nomZone, nbCapacite);

        ZooBuilder zooAmnevilleBuilder = new ZooBuilder(nomZoo);

        zooAmnevilleBuilder.appendZone(nomZone, nbCapacite);
        zooAmnevilleBuilder.appendAnimal(nomZone, panda);

        Zoo zooAmneville = zooAmnevilleBuilder.get();

        assertEquals(zooAmneville.getNom(), nomZoo);
        assertEquals(zooAmneville.getZones().get(0).getNom(), nomZone);
        assertEquals(zooAmneville.getZones().get(0).getCapacite(), nbCapacite);
        assertEquals(zooAmneville.getZones().get(0).getAnimals(), animals);

    }
}