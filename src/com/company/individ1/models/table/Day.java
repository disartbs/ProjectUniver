package com.company.individ1.models.table;

import com.company.individ1.exceptions.TimeException;
import com.company.individ1.models.time.SimpleTime;
import com.company.individ1.models.workers.FullTimeWorker;

import java.util.Calendar;

public class Day {
    private FullTimeWorker worker;
    private Calendar date;
    private SimpleTime startTime;
    private SimpleTime endTime;

    public Day(FullTimeWorker worker, Calendar date, SimpleTime startTime, SimpleTime endTime) {
        this.worker = worker;
        this.date = date;
        try {
            setStartEndTime(startTime, endTime);//TODO
        } catch (TimeException exception) {
            System.out.println(exception.getMessage() + " default will be 8:00/18:00");
            safeSetStartEndTime(new SimpleTime(8, 0), new SimpleTime(18, 0));
        }
    }

    private void safeSetStartEndTime(SimpleTime startTime, SimpleTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void setStartEndTime(SimpleTime startTime, SimpleTime endTime) throws TimeException {
        if (startTime.getValue() >= endTime.getValue())
            throw new TimeException("End before start");
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public FullTimeWorker getWorker() {
        return worker;
    }

    public Calendar getDate() {
        return date;
    }

    public SimpleTime getStartTime() {
        return startTime;
    }

    public SimpleTime getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "Day{" +
                "worker=" + worker.getName() +
                ", date=" + date.getTime() +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
