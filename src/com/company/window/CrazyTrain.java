package com.company.window;

import java.util.ArrayList;

public class CrazyTrain {
    int number;
    ArrayList<String> cities;
    int countOfCompartments;

    public CrazyTrain() {
        cities = new ArrayList<>();
    }

    public CrazyTrain(int number, int count) {
        this.number = number;
        this.countOfCompartments = count;
        cities = new ArrayList<>();
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void addCity(String city) {
        cities.add(city);
    }

    public void setCountOfCompartments(int countOfCompartments) {
        this.countOfCompartments = countOfCompartments;
    }

    public boolean isStopInCity(String city){
        return cities.contains(city);
    }

    @Override
    public String
    toString() {
        return "CrazyTrain{" +
                "number=" + number +
                ", cities=" + cities +
                ", countOfCompartments=" + countOfCompartments +
                '}';
    }
}
