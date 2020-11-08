package com.company.zoo.zoos;

import com.company.zoo.interfaces.income.ParkIncome;
import com.company.zoo.interfaces.park.ParkWork;
import com.company.zoo.interfaces.income.ZooIncome;
import com.company.zoo.exceptions.NotEqualsException;
import com.company.zoo.exceptions.NotInZooOrOcenariumException;
import com.company.zoo.models.common.Entity;

import java.util.Arrays;

public class Zoo extends Park implements ParkWork {

    private ZooIncome[] entities;

    public Zoo(String name) {
        super(name);
        this.entities = new ZooIncome[0];
    }

    public Zoo(ZooIncome[] entities, int date, String name) {
        super(name);
        this.entities = entities;
        setIncome(date);
    }

    private void setIncome(int date) {
        for (ZooIncome entity : entities) {
            entity.setIncomeDate(date, this);
        }
    }


    @Override
    public int getPosition(Entity entity) throws NotInZooOrOcenariumException {
        for (int i = 0; i < entities.length; i++) {
                if(((Entity)entities[i]).equals(entity))
                    return i;
                else
                    continue;
        }
       return -1;
    }

    @Override
    public String getName() {
        return name;
    }

    public void deleteEntity(Entity entity) throws NotInZooOrOcenariumException {
        deleteByIndex(getPosition(entity));
    }

  //  public void addEntity(Entity )

    public void addEntity(ZooIncome zooEntity, int date){
        zooEntity.setIncomeDate(date, this);
        ZooIncome[] newEntities = new ZooIncome[entities.length + 1];
        for (int i = 0; i < entities.length; i++) {
            newEntities[i] = entities[i];
        }
        newEntities[newEntities.length - 1] = zooEntity;
        entities = newEntities;
    }

    public boolean deleteByIndex(int index) {
        boolean flag = false;
        ZooIncome[] newEntities = new ZooIncome[entities.length - 1];
        for(int i = 0, j = 0; i < entities.length; i++, j++){
            if(i == index){
                j--;
                flag = true;
                continue;
            } else
                newEntities[j] = entities[i];
        }
        if(flag)
        entities = newEntities;
        return flag;
    }



    @Override
    public String toString() {
        return "Zoo " +
                "entities " + Arrays.toString(entities);
    }
}
