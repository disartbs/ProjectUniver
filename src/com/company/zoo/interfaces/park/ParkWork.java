package com.company.zoo.interfaces.park;

import com.company.zoo.exceptions.NotInZooOrOcenariumException;
import com.company.zoo.models.common.Entity;

public interface ParkWork {
    int getPosition(Entity animal) throws NotInZooOrOcenariumException;

    String getName();
}