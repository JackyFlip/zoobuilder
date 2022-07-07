package org.example;

import org.example.builder.ZooBuilder;
import org.example.director.Director;
import org.example.zoo.Animal;
import org.example.zoo.Zoo;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        String nomDuZoo = "Beauval";
        ZooBuilder zooBeauvalBuilder= new ZooBuilder(nomDuZoo);

        director.constructZooBeauval(zooBeauvalBuilder);

        Zoo zooBeauval = zooBeauvalBuilder.get();

        System.out.println(zooBeauval);

    }
}