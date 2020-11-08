package com.company.zoo.zoos;

import com.company.zoo.exceptions.NotEqualsException;
import com.company.zoo.exceptions.NotInZooOrOcenariumException;
import com.company.zoo.interfaces.income.ParkIncome;
import com.company.zoo.interfaces.income.ZooIncome;
import com.company.zoo.interfaces.park.ParkWork;
import com.company.zoo.models.common.Entity;

public class Park implements ParkWork {

    private ParkIncome[] entities;
    protected String name;

    public Park(ParkIncome[] entities, String name) {
        this.entities = entities.clone();
        this.name = name;
    }

    public Park(String name) {
        this.name = name;
        entities = new ParkIncome[0];
    }

    @Override
    public int getPosition(Entity entity) throws NotInZooOrOcenariumException {
        for (int i = 0; i < entities.length; i++) {
                if(((Entity)entities[i]).equals(entity))
                    return i;
                else continue;
        }
        throw new NotInZooOrOcenariumException(1);
    }

    @Override
    public String getName() {
        return name;
    }
}
