package com.company.zoo;

import com.company.zoo.interfaces.income.OceanariumIncome;
import com.company.zoo.interfaces.income.ZooIncome;
import com.company.zoo.models.common.Entity;
import com.company.zoo.models.park.ParkAnimal;
import com.company.zoo.models.park.ParkFish;
import com.company.zoo.zoos.Park;


public class Main {

    public static void main(String[] args) {
        Park<ZooIncome> zoo = new Park<>(new ParkAnimal[]{new ParkAnimal("qqwq", "qwwwww", "eee", 1, 'q')}, 2,"Zoo");
        ZooIncome parkAnimal = new ParkAnimal("qqq", "qqqq", "eee", 1,'q');
        System.out.println(zoo);
        zoo.addEntity(parkAnimal, 1);
        System.out.println(zoo);
        zoo.deleteEntity((Entity) parkAnimal);
        System.out.println(zoo);
        Park<OceanariumIncome> oceanarium = new Park<>(new ParkFish[]{ new ParkFish("qrsqq", "qdcqqq", "eege", "qq",false,11 )}, 33, "Ocean");
        System.out.println(oceanarium);

    }
}
