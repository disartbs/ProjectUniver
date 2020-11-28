package com.company.zoo.zoos;

import com.company.zoo.exceptions.NotEqualsException;
import com.company.zoo.exceptions.NotInZooOrOcenariumException;
import com.company.zoo.interfaces.income.ParkIncome;
import com.company.zoo.interfaces.income.ZooIncome;
import com.company.zoo.interfaces.park.ParkWork;
import com.company.zoo.models.common.Entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Park<T extends ParkIncome> implements ParkWork {

    private ArrayList<T> entities;
    protected String name;

    public Park(T[] entities,int date, String name) {
        this.entities = new ArrayList<>(Arrays.asList(entities));
        this.name = name;
        setIncome(date);
    }

    public Park(String name) {
        this.name = name;
        entities = new ArrayList<>();
    }

    public void addEntity(ZooIncome zooEntity, int date){
        zooEntity.setIncomeDate(date, this);
        entities.add((T) zooEntity);
    }

    private void setIncome(int date) {
        for (T entity : entities) {
            entity.setIncomeDate(date, this);
        }
    }

    @Override
    public int getPosition(Entity entity){
        return entities.indexOf(entity);
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean deleteEntity(Entity entity) {
        return entities.remove(entity);
    }

    public boolean deleteByIndex(int index) {
       return entities.remove(entities.get(index));
    }

    @Override
    public String toString() {
        return "Park{" +
                "entities=" + entities +
                ", name='" + name + '\'' +
                '}';
    }
}
