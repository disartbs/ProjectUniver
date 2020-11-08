package com.company.zoo.models.common;

import com.company.zoo.exceptions.NotEqualsException;

public abstract class Entity {
    
    protected String name;
    protected String kind;

    public Entity(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }
}
