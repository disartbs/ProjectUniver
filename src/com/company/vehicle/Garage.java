package com.company.vehicle;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Garage {

    String address;
    int capacity;
    Vehicle[] vehicles;
    private int actualCapacity;

    public Garage(String address, Vehicle[] vehicles) {
        this.address = address;
        capacity = vehicles.length;
        this.vehicles = vehicles;
        actualCapacity = vehicles.length;
    }

    Garage(String address, int capacity) {
        this.address = address;
        this.capacity = capacity;
        this.actualCapacity = 0;
        vehicles = new Vehicle[capacity];
    }

    static Garage newInstance(Garage garage) {
        return new Garage(garage.address, garage.vehicles.clone());
    }

    boolean findVehicle(String number){
        for(int i = 0; i < actualCapacity; ++i)
            if(vehicles[i].number.equals(number))
                return true;
        return false;
    }

    static Garage initAll(){
        out.println("Введите адрес гаража");
        Scanner scanner = new Scanner(in);
        String address = scanner.next();
        out.println("Количество транспортных средств");
        int capacity = scanner.nextInt();
        Garage garage = new Garage(address, capacity);
        while (garage.inputNewVehicle(scanner)) {
        }
        return garage;
    }

    static Garage initAll(Scanner scanner){
        out.println("Введите адрес гаража");
        String address = scanner.next();
        out.println("Количество транспортных средств");
        int capacity = scanner.nextInt();
        Garage garage = new Garage(address, capacity);
        while (garage.inputNewVehicle(scanner)) {
        }
        return garage;
    }

    void inputVehicles(){
        out.println("Количество транспортных средств");
        Scanner scanner = new Scanner(in);
        int capacity = scanner.nextInt();
        Garage garage = new Garage("London", capacity);
        while (garage.inputNewVehicle(scanner)) {
        }
    }

    boolean inputNewVehicle() {
        if (actualCapacity == capacity) {
            out.println("Мест больше нет");
            return false;
        }
        Scanner scanner = new Scanner(in);
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

    boolean inputNewVehicle(Scanner scanner) {
        if (actualCapacity == capacity) {
            out.println("Мест больше нет");
            return false;
        }
        scanner = new Scanner(in);
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

    public int getActualCapacity() {
        return actualCapacity;
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

    Car[] getCars(){
        int index = 0;
        Car[] cars = new Car[getCarCount()];
        for(Vehicle vehicle : vehicles)
            if(vehicle instanceof Car)
                cars[index++] = Car.copy((Car) vehicle);
        return cars;
    }

    Truck[] getTrucks() {
        int index = 0;
        Truck[] trucks = new Truck[getTruckCount()];
        for(Vehicle vehicle : vehicles)
            if(vehicle instanceof Truck)
                trucks[index++] = Truck.copy((Truck) vehicle);
        return trucks;
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
