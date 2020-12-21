package com.company.zoo.models.zoo;

import com.company.zoo.interfaces.income.ZooIncome;
import com.company.zoo.models.common.Fish;
import com.company.zoo.models.park.ParkAnimal;
import com.company.zoo.models.park.ParkFish;
import com.company.zoo.zoos.Park;

import java.util.Scanner;

public class Zoo extends Park<ZooIncome> {
    public Zoo(ZooIncome[] entities, int date, String name) {
        super(entities, date, name);
    }

    public Zoo(String name) {
        super(name);
    }

    @Override
    public void input(Scanner scanner) {
        int f;
        int date;
        while(true){
            System.out.println("1 - Animal, 2 - Fish, 3 - break");
            f = scanner.nextInt();
            if(f ==3) break;
            System.out.println("date");
            date = scanner.nextInt();
            switch (f) {
                case 1 :{
                    addEntity( new ParkAnimal(scanner), date);
                    break;
                }

                case 2 :{
                    addEntity(new ParkFish(scanner), date);
                    break;
                }

                case 3: break;

            }
        }
    }
}
