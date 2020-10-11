package com.company.vehicle;

import java.util.Arrays;
import java.util.Scanner;

public class GarageNetwork {

    String name;
    private Garage[] garages;

    public GarageNetwork(String name){
        this.name = name;
        garages = new Garage[0];
    }

    int getGaragesCount(){
        return garages.length;
    }

    void addGarage(Garage newGarage){
        int garagesCount = getGaragesCount();
        Garage[] newGarages = new Garage[garagesCount + 1];
        int i;
        for(i = 0; i < garagesCount; ++i)
            newGarages[i] = garages[i];
        newGarages[i] = newGarage;
        garages = newGarages;
    }

    Garage getGarage(int index){
        if( index < 1)
            return null;
        if(index < getGaragesCount())
            return garages[index - 1];
        return null;
    }

    Garage getGarage(String address){
        int garagesCount = getGaragesCount();
        for(int i = 0; i < garagesCount; i++) {
            if (garages[i].address.equals(address))
                return garages[i];
        }
        return null;
    }

    Garage findVehiclesGarage(String number){
        int garagesCount = getGaragesCount();
        for(int i = 0; i < garagesCount; i++){
            if (garages[i].findVehicle(number))
                return garages[i];
        }
        return null;
    }

    int getTrucksCount() {
        int count = 0;
        for (Garage garage : garages) {
            count += garage.getTruckCount();
        }
        return count;
    }

    int getBusesCount() {
        int count = 0;
        for (Garage garage : garages) {
            count += garage.getBusCount();
        }
        return count;
    }

    int getCarsCount() {
        int count = 0;
        for (Garage garage : garages) {
            count += garage.getCarCount();
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

    Bus[] getAllBuses() {
        Bus[] buses = new Bus[getTrucksCount()];
        Bus[] busesDonor;
        int busesIndex = 0;
        int trucksDonorIndex = 0;
        for (Garage garage : garages) {
            busesDonor = garage.getBuses();
            trucksDonorIndex = 0;
            for (; trucksDonorIndex < busesDonor.length; ++busesIndex, ++trucksDonorIndex)
                buses[busesIndex] = busesDonor[trucksDonorIndex];
        }
        return buses;
    }

    Car[] getAllCars() {
        Car[] cars = new Car[getTrucksCount()];
        Car[] carsDonor;
        int carsIndex = 0;
        int carsDonorIndex = 0;
        for (Garage garage : garages) {
            carsDonor = garage.getCars();
            carsDonorIndex = 0;
            for (; carsDonorIndex < carsDonor.length; ++carsIndex, ++carsDonorIndex)
                cars[carsIndex] = carsDonor[carsDonorIndex];
        }
        return cars;
    }
}
