package com.company.zoo.models.oceanarium;

import com.company.zoo.interfaces.income.OceanariumIncome;
import com.company.zoo.models.park.ParkAnimal;
import com.company.zoo.models.park.ParkFish;
import com.company.zoo.models.park.ParkSnake;
import com.company.zoo.zoos.Park;

import java.util.Scanner;

public class Ocean extends Park<OceanariumIncome> {
    public Ocean(OceanariumIncome[] entities, int date, String name) {
        super(entities, date, name);
    }

    public Ocean(String name) {
        super(name);
    }

    @Override
    public void input(Scanner scanner) {
        int f;
        int date;
        while(true){
            System.out.println("1 - Snake, 2 - Fish, 3 - break");
            f = scanner.nextInt();
            if(f ==3) break;
            System.out.println("date");
            date = scanner.nextInt();
            switch (f) {
                case 1 :{
                    addEntity( new ParkSnake(scanner), date);
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

