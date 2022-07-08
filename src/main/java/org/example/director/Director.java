package org.example.director;

import org.example.builder.ZooBuilder;
import org.example.zoo.Animal;

public class Director {

    /* Construction du zoo de Beauval */
    public void constructZooBeauval(ZooBuilder zooBuilder) {
        // Création d'animaux
        Animal lion = new Animal("lion");
        Animal dauphin = new Animal("dauphin");
        Animal singe = new Animal("singe");
        Animal girafe = new Animal("girafe");

        // Création de zones
        String zoneLion = "Zone des lions";
        String zoneDauphin = "Zone des dauphins";
        String zoneSinge = "Zone des singes";
        String zoneGirafe = "Zone des girafes";

        // Création de capacités
        Integer capaciteLion = 5;
        Integer capaciteDauphin = 7;
        Integer capaciteSinge = 13;
        Integer capaciteGirafe = 3;

        // Ajout des zones au zoo
        zooBuilder.appendZone(zoneLion, capaciteLion);
        zooBuilder.appendZone(zoneDauphin, capaciteDauphin);
        zooBuilder.appendZone(zoneSinge, capaciteSinge);
        zooBuilder.appendZone(zoneGirafe, capaciteGirafe);

        // Ajout des lions au zoo
        zooBuilder.appendAnimalv2(zoneLion, lion);
        zooBuilder.appendAnimalv2(zoneLion, lion);
        zooBuilder.appendAnimalv2(zoneLion, lion);

        // Ajout des dauphins au zoo
        zooBuilder.appendAnimalv2(zoneDauphin, dauphin);
        zooBuilder.appendAnimalv2(zoneDauphin, dauphin);

        // Ajout des singes au zoo
        zooBuilder.appendAnimalv2(zoneSinge, singe);
        zooBuilder.appendAnimalv2(zoneSinge, singe);
        zooBuilder.appendAnimalv2(zoneSinge, singe);
        zooBuilder.appendAnimalv2(zoneSinge, singe);
        zooBuilder.appendAnimalv2(zoneSinge, singe);

        // Ajout des girafes au zoo
        zooBuilder.appendAnimalv2(zoneGirafe, girafe);
        zooBuilder.appendAnimalv2(zoneGirafe, girafe);
    }

}
