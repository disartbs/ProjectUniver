package com.company.zoo.models.common;

import com.company.zoo.exceptions.NotEqualsException;

import java.util.Objects;

public class Snake extends Entity {

    protected int age;
    protected int length;
    protected boolean isPoisons;

    public Snake(String name, String kind, int age, int length, boolean isPoisons) {
        super(name, kind);
        this.age = age;
        this.length = length;
        this.isPoisons = isPoisons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Snake)) return false;
        Snake snake = (Snake) o;
        return getAge() == snake.getAge() &&
                getLength() == snake.getLength() &&
                isPoisons() == snake.isPoisons();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getLength(), isPoisons());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isPoisons() {
        return isPoisons;
    }

    public void setPoisons(boolean poisons) {
        isPoisons = poisons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
