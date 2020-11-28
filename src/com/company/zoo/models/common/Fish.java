package com.company.zoo.models.common;

import com.company.zoo.exceptions.NotEqualsException;

import java.util.Objects;

public class Fish extends Entity {

    protected String water;
    protected String type;
    protected boolean edible;
    protected int age;

    public Fish(String name, String kind, String water, String type, boolean edible, int age) {
        super(name, kind);
        this.water = water;
        this.type = type;
        this.edible = edible;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fish)) return false;
        Fish fish = (Fish) o;
        return isEdible() == fish.isEdible() &&
                name.equals(fish.name) &&
                kind.equals(fish.kind) &&
                getAge() == fish.getAge() &&
                Objects.equals(getWater(), fish.getWater()) &&
                Objects.equals(getType(), fish.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWater(), getType(), isEdible(), getAge());
    }

    @Override
    public String toString() {
        return "Fish " +
                "water " + water +
                ", type " + type +
                ", edible " + edible +
                ", age " + age;
    }





    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEdible() {
        return edible;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
