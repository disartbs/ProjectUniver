package com.company.zoo;

import com.company.zoo.exceptions.NotInZooOrOcenariumException;
import com.company.zoo.interfaces.income.ZooIncome;
import com.company.zoo.models.park.ParkAnimal;
import com.company.zoo.zoos.Zoo;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo(new ZooIncome[]{new ParkAnimal("qqwq", "qwwwww", "eee", 1,'q')}, 2,"Zoo");
        System.out.println(zoo);
        ParkAnimal parkAnimal = new ParkAnimal("qqq", "qqqq", "eee", 1,'q');
        zoo.addEntity(parkAnimal, 1);
        System.out.println(zoo);
        try {
            System.out.println(parkAnimal.getPositionInZoo());
        } catch (NotInZooOrOcenariumException e) {
            e.printStackTrace();
        }
        try {
            zoo.deleteEntity(parkAnimal);
        } catch (NotInZooOrOcenariumException e) {
            e.printStackTrace();
        }
        System.out.println(zoo);

    }
}
