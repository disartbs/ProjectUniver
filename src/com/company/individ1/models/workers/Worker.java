package com.company.individ1.models.workers;

import com.company.individ1.exceptions.TimeException;
import com.company.individ1.models.otdel.MyOtdel;

public abstract class Worker {
    String name;
    int birthYear;

    public Worker(String name, int birthYear) {
        this.name = name;
        try {
            setBirthYear(birthYear);
        } catch (TimeException exception) {
            System.out.println(exception.getMessage() + "default will be 2000");
            safeSetBirthYear(2000);
        }
    }

    private void safeSetBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) throws TimeException {
        if (birthYear < 1940 || birthYear > 2002)
            throw new TimeException("impossible age for this work");
        this.birthYear = birthYear;
    }

    public abstract void attachOtdel(MyOtdel otdel);

    public abstract String output();

}
