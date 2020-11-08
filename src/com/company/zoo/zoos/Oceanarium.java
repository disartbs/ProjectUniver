package com.company.zoo.zoos;

import com.company.zoo.exceptions.NotEqualsException;
import com.company.zoo.interfaces.income.ZooIncome;
import com.company.zoo.models.common.Entity;
import com.company.zoo.interfaces.park.ParkWork;
import com.company.zoo.interfaces.income.OceanariumIncome;
import com.company.zoo.exceptions.NotInZooOrOcenariumException;

import java.util.Arrays;

public class Oceanarium extends Park implements ParkWork {

    OceanariumIncome[] entities;

    public Oceanarium(String name) {
        super(name);
        this.entities = new OceanariumIncome[0];
    }


    public Oceanarium(OceanariumIncome[] entities, int date, String name) {
        super(name);
        this.entities = entities;
        setIncome(date);
    }

    private void setIncome(int date) {
        for (OceanariumIncome entity : entities) {
            entity.setIncomeDate(date, this);
        }
    }

    @Override
    public int getPosition(Entity entity) throws NotInZooOrOcenariumException {
        for (int i = 0; i < entities.length; i++) {
                if(((Entity) entities[i]).equals(entity))
                    return i;
            else
                continue;
        }
        return -1;
    }

    public boolean deleteByIndex(int index) {
        boolean flag = false;
        OceanariumIncome[] newEntities = new OceanariumIncome[entities.length - 1];
        for(int i = 0, j = 0; i < entities.length; i++, j++){
            if(i == index){
                i++;
                flag = true;
            } else
                newEntities[j] = entities[i];
        }
        entities = newEntities;
        return flag;
    }

    public void deleteEntity(Entity entity) throws NotInZooOrOcenariumException {
        deleteByIndex(getPosition(entity));
    }

    public void addEntity(OceanariumIncome entity) throws NotInZooOrOcenariumException {
        if (entity.getIncomeDate() == 0)
            throw new NotInZooOrOcenariumException(1);
        OceanariumIncome[] newEntities = new OceanariumIncome[entities.length + 1];
        for (int i = 0; i < entities.length; i++) {
            newEntities[i] = entities[i];
        }
        newEntities[newEntities.length - 1] = entity;
        entities = newEntities;
    }

    void addEntity(OceanariumIncome entity, int incomeDate) {
        entity.setIncomeDate(incomeDate);
        OceanariumIncome[] newEntities = new OceanariumIncome[entities.length + 1];
        for (int i = 0; i < entities.length; i++) {
            newEntities[i] = entities[i];
        }
        newEntities[newEntities.length - 1] = entity;
        entities = newEntities;
    }


    @Override
    public String toString() {
        return "Oceanarium " +
                "entities " + Arrays.toString(entities);
    }
}
