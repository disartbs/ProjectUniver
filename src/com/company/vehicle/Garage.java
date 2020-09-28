package com.company.vehicle;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class Garage {

    String address;
    int capacity;
    Vehicle[] vehicles;
    private int actualCount;

    Garage(String address, int capacity) {
        this.address = address;
        this.capacity = capacity;
        this.actualCount = 0;
        vehicles = new Vehicle[capacity];
    }

    boolean inputNewVehicle() {
        if (actualCount == capacity) {
            out.println("Мест больше нет");
            return false;
        }
        Scanner scanner = new Scanner(System.in);
        out.println("Какой тип транспортного средства? 1 - Car, 2 - Truck, 3 - Bus, 4 - break");
        int type = scanner.nextInt();
        switch (type) {
            case 1 -> vehicles[actualCount] = new Car();
            case 2 -> vehicles[actualCount] = new Truck();
            case 3 -> vehicles[actualCount] = new Bus();
            case 4 -> {
                return false;
            }
        }
        vehicles[actualCount++].input(scanner);
        return true;
    }

    boolean inputNewVehicle(Scanner scanner) {
        if (actualCount == capacity) {
            out.println("Мест больше нет");
            return false;
        }
        scanner = new Scanner(System.in);
        out.println("Какой тип транспортного средства? 1 - Car, 2 - Truck, 3 - Bus, 4 - break");
        int type = scanner.nextInt();
        switch (type) {
            case 1 -> vehicles[actualCount] = new Car();
            case 2 -> vehicles[actualCount] = new Truck();
            case 3 -> vehicles[actualCount] = new Bus();
            case 4 -> {
                return false;
            }
        }
        vehicles[actualCount++].input(scanner);
        return true;
    }

    public int getActualCount() {
        return actualCount;
    }

    int getBusCount() {
        int count = 0;
        for (Vehicle vehicle : vehicles)
            if (vehicle instanceof Bus)
                ++count;
        return count;
    }

    int getCarCount() {
        int count = 0;
        for (Vehicle vehicle : vehicles)
            if (vehicle instanceof Car)
                ++count;
        return count;
    }

    int getTruckCount() {
        int count = 0;
        for (Vehicle vehicle : vehicles)
            if (vehicle instanceof Truck)
                ++count;
        return count;
    }

    Bus[] getBuses(){
        int index = 0;
        Bus[] buses = new Bus[getBusCount()];
        for(Vehicle vehicle : vehicles)
            if(vehicle instanceof Bus)
                buses[index++] = Bus.copy2((Bus) vehicle);
            //buses[intex++] = (new Bus()).copy1((Bus) vehicle);
            // copy2 работает с this, поэтому заполняет поля из vehicle. Копирует себя и себя вернет.
        return buses;
    }

    @Override
    public String toString() {
        return "Garage " +
                "\naddress = " + address +
                "\ncapacity = " + capacity +
                "\nactualCapacity = " + actualCount +
                "\nvehicles = " + Arrays.toString(vehicles);
    }
}
