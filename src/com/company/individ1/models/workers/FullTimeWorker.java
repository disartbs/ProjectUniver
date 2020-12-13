package com.company.individ1.models.workers;

import com.company.individ1.exceptions.TimeException;
import com.company.individ1.models.otdel.MyOtdel;


public class FullTimeWorker extends Worker {

    private MyOtdel otdel;
    private int experience;
    private int numberWorkingHours;
    private int workingRate;

    public FullTimeWorker(String name, int birthYear, int experience, int numberWorkingHours, int workingRate) {
        super(name, birthYear);
        try {
            setExperience(experience);
        } catch (TimeException exception) {
            System.out.println(exception.getMessage() + "default will be 0");
            safeSetExperience(0);
        }
        this.numberWorkingHours = numberWorkingHours;
        this.workingRate = workingRate;
    }

    private void safeSetExperience(int experience) {
        this.experience = experience;
    }

    public void quit() {
        otdel.quitMe(this);
        otdel = null;
    }

    @Override
    public void attachOtdel(MyOtdel otdel) {
        this.otdel = otdel;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) throws TimeException {
        if (experience >= 2020 - birthYear - 18)
            throw new TimeException("impossible experience");
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FullTimeWorker)) return false;
        FullTimeWorker that = (FullTimeWorker) o;
        return getExperience() == that.getExperience() &&
                getName().equals(that.getName()) &&
                getBirthYear() == that.getBirthYear();
    }

    @Override
    public String output() {
        return toString();
    }

    @Override
    public String toString() {
        String otdelStr;
        if (otdel == null)
            otdelStr = "null";
        else otdelStr = otdel.getName();
        return "FullTimeWorker{" +
                "otdel=" + otdelStr +
                ", experience=" + experience +
                ", numberWorkingHours=" + numberWorkingHours +
                ", workingRate=" + workingRate +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
