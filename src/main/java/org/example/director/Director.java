package org.example.director;

import org.example.builder.ZooBuilder;
import org.example.zoo.Animal;

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

        zooBuilder.appendAnimalv2(zoneLion, lion);
        zooBuilder.appendAnimalv2(zoneLion, lion);
        zooBuilder.appendAnimalv2(zoneLion, lion);

//        zooBuilder.appendAnimalv2(zoneDauphin, dauphin);
//        zooBuilder.appendAnimalv2(zoneDauphin, dauphin);
//
//        zooBuilder.appendAnimalv2(zoneSinge, singe);
//        zooBuilder.appendAnimalv2(zoneSinge, singe);
//        zooBuilder.appendAnimalv2(zoneSinge, singe);
//        zooBuilder.appendAnimalv2(zoneSinge, singe);
//        zooBuilder.appendAnimalv2(zoneSinge, singe);
//
//        zooBuilder.appendAnimalv2(zoneGirafe, girafe);
//        zooBuilder.appendAnimalv2(zoneGirafe, girafe);
    }

}
