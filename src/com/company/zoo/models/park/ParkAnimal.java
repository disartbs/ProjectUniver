package com.company.zoo.models.park;

import com.company.zoo.exceptions.NotInZooOrOcenariumException;
import com.company.zoo.interfaces.income.ZooIncome;
import com.company.zoo.interfaces.park.ParkWork;
import com.company.zoo.models.common.Animal;

import java.util.Scanner;

public class ParkAnimal extends Animal implements ZooIncome {

    private int income;
    private ParkWork owner;

    public ParkAnimal(String name, String kind, String continent, int age, char sex) {
        super(name, kind, continent, age, sex);
        this.income = 0;
        this.owner = null;
    }

    public ParkAnimal(Scanner scanner) {
        super(scanner);
    }

    public int getPositionInZoo() throws NotInZooOrOcenariumException {
        return owner.getPosition(this);
    }

    @Override
    public String toString() {
        return "ZooAnimal{" +
                "name='" + name + '\'' +
                "continent='" + continent + '\'' +
                ", kind='" + kind + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", income=" + income +
                ", myZoo=" + owner.getName() +
                '}';
    }

    @Override
    public void setIncomeDate(int date, ParkWork zoo) {
        income = date;
        this.owner = zoo;
    }

    @Override
    public int getIncomeDate() {
        return income;
    }

    @Override
    public void setZoo(ParkWork zoo) {
        this.owner = zoo;
    }

}
