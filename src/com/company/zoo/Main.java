package com.company.zoo;

import com.company.zoo.interfaces.income.OceanariumIncome;
import com.company.zoo.interfaces.income.ZooIncome;
import com.company.zoo.models.common.Entity;
import com.company.zoo.models.oceanarium.Ocean;
import com.company.zoo.models.park.ParkAnimal;
import com.company.zoo.models.park.ParkFish;
import com.company.zoo.models.zoo.Zoo;
import com.company.zoo.zoos.Park;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Park<ZooIncome> zoo = new Zoo(new ParkAnimal[]{new ParkAnimal("qqwq", "qwwwww", "eee", 1, 'q')}, 2,"Zoo");
        ZooIncome parkAnimal = new ParkAnimal("qqq", "qqqq", "eee", 1,'q');
        System.out.println(zoo);
        zoo.addEntity(parkAnimal, 1);
        System.out.println(zoo);
        zoo.deleteEntity((Entity) parkAnimal);
        System.out.println(zoo);
        Park<OceanariumIncome> oceanarium = new Ocean(new ParkFish[]{ new ParkFish("qrsqq", "qdcqqq", "eege", "qq",false,11 )}, 33, "Ocean");
        System.out.println(oceanarium);
        zoo.input(new Scanner(System.in));
        System.out.println(zoo);
        oceanarium.input(scanner);
        System.out.println(oceanarium);
       // System.out.println(new ParkAnimal(scanner));
    }
}
