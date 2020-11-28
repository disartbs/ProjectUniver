package com.company.zoo.models.park;

import com.company.zoo.exceptions.NotEqualsException;
import com.company.zoo.models.common.Entity;
import com.company.zoo.interfaces.park.ParkWork;
import com.company.zoo.models.common.Snake;
import com.company.zoo.interfaces.income.OceanariumIncome;

import java.util.Objects;

public class ParkSnake extends Snake implements OceanariumIncome {


    private int incomeDate;
    private ParkWork owner;

    public ParkSnake(String name, String kind, int age, int length, boolean isPoisons, int incomeDate, ParkWork owner) {
        super(name, kind, age, length, isPoisons);
        this.incomeDate = incomeDate;
        this.owner = owner;
    }

    @Override
    public void setIncomeDate(int date, ParkWork zoo) {
        incomeDate = date;
        owner = zoo;
    }

    @Override
    public int getIncomeDate() {
        return incomeDate;
    }

    @Override
    public void setZoo(ParkWork zoo) {
        owner = zoo;
    }
}
