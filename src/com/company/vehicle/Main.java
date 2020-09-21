package com.company.vehicle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Garage garage = new Garage("London", 5);
        while (garage.inputNewVehicle(new Scanner(System.in))){

        }
        if(garage.getBusCount() > garage.getCarCount())
            System.out.println("Автобусов больше");
        else if(garage.getBusCount() < garage.getCarCount())
            System.out.println("Машин больше");
        else System.out.println("Поровну");
    }
}

