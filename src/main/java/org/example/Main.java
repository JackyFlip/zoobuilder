package org.example;

import org.example.builder.ZooBuilder;
import org.example.director.Director;
import org.example.zoo.Animal;
import org.example.zoo.Zoo;

public class Main {
    public static void main(String[] args) {

        // Création d'un directeur
        Director director = new Director();

        // Création d'un builder de zoo
        String nomDuZoo = "Beauval";
        ZooBuilder zooBeauvalBuilder= new ZooBuilder(nomDuZoo);

        // Construction du zoo
        director.constructZooBeauval(zooBeauvalBuilder);

        // Récupération du zoo après sa construction
        Zoo zooBeauval = zooBeauvalBuilder.get();

        System.out.println(zooBeauval);

    }
}