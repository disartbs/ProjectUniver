package com.company.vehicle;

import java.util.Arrays;
import java.util.Scanner;

public class GarageNetwork {

    String name;
    int count;
    Garage[] garages;
    int actualCount;

    public GarageNetwork(String name, Garage[] garages) {
        this.name = name;
        count = garages.length;
        this.garages = garages;
        actualCount = garages.length;
    }

    public GarageNetwork(String name, int count) {
        this.name = name;
        this.count = count;
        garages = new Garage[count];
    }

    String findVehiclesGarageAddress(String number){
        for(int i = 0; i < actualCount; i++){
            if (garages[i].findVehicle(number))
                return garages[i].address;
        }
        return "Not found";
    }

    int getTrucksCount() {
        int count = 0;
        for (Garage garage : garages) {
            count += garage.getTruckCount();
        }
        return count;
    }

    Truck[] getAllTrucks() {
        Truck[] trucks = new Truck[getTrucksCount()];
        Truck[] trucksDonor;
        int trucksIndex = 0;
        int trucksDonorIndex = 0;
        for (Garage garage : garages) {
            trucksDonor = garage.getTrucks();
            trucksDonorIndex = 0;
            for (; trucksDonorIndex < trucksDonor.length; ++trucksIndex, ++trucksDonorIndex)
                trucks[trucksIndex] = trucksDonor[trucksDonorIndex];
        }
        return trucks;
    }

    boolean addNewGarage() {
        if (actualCount == count) {
            System.out.println("В сети больше нет места");
            return false;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Ввести гараж, 2 - break");
        int action = scanner.nextInt();
        switch (action) {
            case 1: {
                garages[actualCount++] = Garage.initAll(scanner);
            }
            case 2: {
                return false;
            }
        }
        return true;
    }

    boolean addNewGarage(Scanner scanner) {
        if (actualCount == count) {
            System.out.println("В сети больше нет места");
            return false;
        }
        System.out.println("1 - Ввести гараж, 2 - break");
        int action = scanner.nextInt();
        switch (action) {
            case 1: {
                garages[actualCount] = Garage.initAll(scanner);
            }
            case 2: {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "GarageNetwork " +
                "garages=" + Arrays.toString(garages) +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", actualCount=" + actualCount;
    }
}
