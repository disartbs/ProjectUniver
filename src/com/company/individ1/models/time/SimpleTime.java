package com.company.individ1.models.time;

public class SimpleTime {
    float time;
    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes) {
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
        time += hours;
        time += minutes * 0.01;
    }

    public SimpleTime(float time) {
        this.time = time;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
        time = 0;
        this.minutes = minutes;
        time += hours;
        time += minutes * 0.01;
    }

    public float getValue() {
        return time;
    }

    @Override
    public String toString() {
        return "" + time;
    }
}
