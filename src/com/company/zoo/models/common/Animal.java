package com.company.zoo.models.common;

import java.util.Objects;

public class Animal extends Entity {

    protected String continent;
    protected int age;
    protected char sex;


    public Animal(String name, String kind, String continent, int age, char sex) {
        super(name, kind);
        this.continent = continent;
        this.kind = kind;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Animal " +
                "continent " + continent +
                ", kind " + kind +
                ", age " + age +
                ", sex " + sex;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getAge() == animal.getAge() &&
                name.equals(animal.name) &&
                kind.equals(animal.kind) &&
                getSex() == animal.getSex() &&
                Objects.equals(getContinent(), animal.getContinent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContinent(), getAge(), getSex());
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
