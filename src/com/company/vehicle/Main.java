package com.company.vehicle;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehiclesForGarageInLondon = {new Bus(423, "a777ws", 'A', 40),
                new Car(120, "x555xx","aaa", 4),
        new Truck(300, "a443dd", "qqq", 4)};
        Vehicle[] vehiclesForGarageInTokyo = {new Truck(350, "b425d", "www", 9),
                new Bus(567, "q345fe", 'B', 47),
                new Truck(134, "m111ax", "ggg", 68),
                new Truck(242, "y468rg", "rrr", 19)};
        Vehicle[]  vehiclesForGarageInNY = {new Bus(423, "a778eg", 'A', 40),
                new Car(120, "x663gx","aaa", 4),
                new Truck(300, "a449dd", "qqq", 4)};
        Garage[] garages = {new Garage("London", vehiclesForGarageInLondon),
                new Garage("Tokyo", vehiclesForGarageInTokyo),
                new Garage("NY", vehiclesForGarageInNY)};
        GarageNetwork garageNetwork = new GarageNetwork("net", garages);
        Truck[] trucks = garageNetwork.getAllTrucks();
        String number = "_";
        int maxTonnage = -1;
        for(Truck truck : trucks){
            if(maxTonnage < truck.tonnage){
                maxTonnage = truck.tonnage;
                number = truck.number;
            }
        }
        System.out.println(garageNetwork.findVehiclesGarageAddress(number));
    }
}

