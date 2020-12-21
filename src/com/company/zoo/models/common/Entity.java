package com.company.zoo.models.common;

import com.company.zoo.exceptions.NotEqualsException;

import java.util.Scanner;

public abstract class Entity {
    
    protected String name;
    protected String kind;

    public Entity(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    public Entity(Scanner scanner){
        input1(scanner);
    }

    public void input1(Scanner scanner){
        System.out.println("name, kind");
        name = scanner.next();
        kind = scanner.next();
    }
}
