package org.example.director;

import org.example.builder.ZooBuilder;
import org.example.zoo.Animal;
import org.example.zoo.Zoo;

public class Director {

    public void constructZooBeauval(ZooBuilder zooBuilder) {
        Animal lion = new Animal("lion");
        Animal dauphin = new Animal("dauphin");
        Animal singe = new Animal("singe");
        Animal girafe = new Animal("girafe");

        String zoneLion = "Zone des lions";
        String zoneDauphin = "Zone des dauphins";
        String zoneSinge = "Zone des singes";
        String zoneGirafe = "Zone des girafes";

        Integer capaciteLion = 5;
        Integer capaciteDauphin = 7;
        Integer capaciteSinge = 13;
        Integer capaciteGirafe = 3;

        zooBuilder.appendZone(zoneLion, capaciteLion);
        zooBuilder.appendZone(zoneDauphin, capaciteDauphin);
        zooBuilder.appendZone(zoneSinge, capaciteSinge);
        zooBuilder.appendZone(zoneGirafe, capaciteGirafe);

        zooBuilder.appendAnimal(zoneLion, lion);
        zooBuilder.appendAnimal(zoneLion, lion);
        zooBuilder.appendAnimal(zoneLion, lion);

        zooBuilder.appendAnimal(zoneDauphin, dauphin);
        zooBuilder.appendAnimal(zoneDauphin, dauphin);

        zooBuilder.appendAnimal(zoneSinge, singe);
        zooBuilder.appendAnimal(zoneSinge, singe);
        zooBuilder.appendAnimal(zoneSinge, singe);
        zooBuilder.appendAnimal(zoneSinge, singe);
        zooBuilder.appendAnimal(zoneSinge, singe);

        zooBuilder.appendAnimal(zoneGirafe, girafe);
        zooBuilder.appendAnimal(zoneGirafe, girafe);
    }

}
