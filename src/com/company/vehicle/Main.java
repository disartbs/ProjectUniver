package com.company.vehicle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Количество транспортных средств");
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        Garage garage = new Garage("London", capacity);
        while (garage.inputNewVehicle(scanner)) {
        }
//        if (garage.getBusCount() > garage.getCarCount())
//            System.out.println("Автобусов больше");
//        else if (garage.getBusCount() < garage.getCarCount())
//            System.out.println("Машин больше");
//        else System.out.println("Поровну");
        Bus[] buses = garage.getBuses();
        for(Bus bus : buses)
            System.out.println(bus);

    }
}

