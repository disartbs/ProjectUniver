package com.company.individ1.models.workList;

import com.company.individ1.exceptions.TimeException;
import com.company.individ1.models.workers.HourlyWorker;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Work {
    private HourlyWorker worker;
    private Calendar date;
    private int numberWorkingHours;
    private int price;

    public Work(HourlyWorker worker, Calendar date, int numberWorkingHours) {
        this.worker = worker;
        try {
            setDate(date);
        } catch (TimeException exception) {
            System.out.println(exception.getMessage() + " default will be 2020.0.1");
            safeSetDate(new GregorianCalendar(2020, 0, 1));
        }
        this.numberWorkingHours = numberWorkingHours;
        price = numberWorkingHours * worker.getPaymentPerHour();
    }

    private void safeSetDate(GregorianCalendar date) {
        this.date = date;
    }

    public void setDate(Calendar date) throws TimeException {
        if (date.after(Calendar.getInstance()))
            throw new TimeException("Date after now");
        this.date = date;
    }

    public HourlyWorker getWorker() {
        return worker;
    }

    public Calendar getDate() {
        return date;
    }

    public int getNumberWorkingHours() {
        return numberWorkingHours;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Work{" +
                "worker=" + worker.getName() +
                ", date=" + date.getTime() +
                ", numberWorkingHours=" + numberWorkingHours +
                ", price=" + price +
                '}';
    }
}
