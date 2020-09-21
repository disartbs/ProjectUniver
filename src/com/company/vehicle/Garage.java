package com.company.vehicle;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Garage {
    String address;
    int capacity;
    int actualCapacity;
    Vehicle [] vehicles;

    Garage (String address, int capacity){
        this.address = address;
        this.capacity = capacity;
        this.actualCapacity = 0;
        vehicles = new Vehicle[capacity];
    }

    boolean inputNewVehicle() {
        if(actualCapacity == capacity)
            return false;
        Scanner scanner = new Scanner(System.in);
        out.println("Какой тип транспортного средства? 1 - Car, 2 - Truck, 3 - Bus");
        int type = scanner.nextInt();
        switch (type) {
            case 1 -> vehicles[actualCapacity] = new Car();
            case 2 -> vehicles[actualCapacity] = new Truck();
            case 3 -> vehicles[actualCapacity] = new Bus();
        }
        vehicles[actualCapacity++].input(scanner);
        return true;
    }

    boolean inputNewVehicle(Scanner scanner) {
        if(actualCapacity == capacity){
            out.println("Мест больше нет");
            return false;
        }
        scanner = new Scanner(System.in);
        out.println("Какой тип транспортного средства? 1 - Car, 2 - Truck, 3 - Bus, 4 - break");
        int type = scanner.nextInt();
        switch (type) {
            case 1 -> vehicles[actualCapacity] = new Car();
            case 2 -> vehicles[actualCapacity] = new Truck();
            case 3 -> vehicles[actualCapacity] = new Bus();
            case 4 -> {
                return false;
            }
        }
        vehicles[actualCapacity++].input(scanner);
        return true;
    }
    
    int getBusCount(){
        int count = 0;
        for (Vehicle vehicle : vehicles) {
            if(vehicle instanceof Bus)
                ++count;
        }
        return count;
    }

    int getCarCount(){
        int count = 0;
        for (Vehicle vehicle : vehicles) {
            if(vehicle instanceof Car)
                ++count;
        }
        return count;
    }

    int getTruckCount(){
        int count = 0;
        for (Vehicle vehicle : vehicles) {
            if(vehicle instanceof Truck)
                ++count;
        }
        return count;
    }

    @Override
    public String toString() {
        return "Garage " +
                "\naddress = " + address +
                "\ncapacity = " + capacity +
                "\nactualCapacity = " + actualCapacity +
                "\nvehicles = " + Arrays.toString(vehicles);
    }
}
