package com.company.zoo.models.park;

import com.company.zoo.exceptions.NotInZooOrOcenariumException;
import com.company.zoo.models.common.Fish;
import com.company.zoo.interfaces.park.ParkWork;
import com.company.zoo.interfaces.income.OceanariumIncome;
import com.company.zoo.interfaces.income.ZooIncome;

import java.util.Scanner;

public class ParkFish extends Fish implements OceanariumIncome, ZooIncome {

    private int incomeDate;
    private ParkWork zoo;

    public ParkFish(String name, String kind, String water, String type, boolean edible, int age) {
        super(name, kind, water, type, edible, age);

    }

    public ParkFish(Scanner scanner){
        super(scanner);
    }

    int getPositionInZoo() throws NotInZooOrOcenariumException {
        return zoo.getPosition(this);
    }

    @Override
    public String toString() {
        return "ParkFish{" +
                "incomeDate=" + incomeDate +
                ", zoo=" + zoo.getName() +
                ", water='" + water + '\'' +
                ", type='" + type + '\'' +
                ", edible=" + edible +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }

    @Override
    public void setIncomeDate(int date, ParkWork zoo) {
        incomeDate = date;
        this.zoo = zoo;
    }

    @Override
    public int getIncomeDate() {
        return incomeDate;
    }

    @Override
    public void setZoo(ParkWork zoo) {
        this.zoo = zoo;
    }
}
