package com.company.zoo.interfaces.income;

import com.company.zoo.interfaces.park.ParkWork;

public interface ParkIncome {

    void setIncomeDate(int date, ParkWork zoo);

   // boolean equals(Object o);

    void setZoo(ParkWork zoo);

    int getIncomeDate();
}
