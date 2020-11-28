package com.company.zoo.interfaces.income;

import com.company.zoo.interfaces.park.ParkWork;

public interface ZooIncome extends ParkIncome{

    void setIncomeDate(int date, ParkWork zoo);

    int getIncomeDate();

    void setZoo(ParkWork zoo);
}
