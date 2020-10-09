package com.company.store;

import java.util.Scanner;

import static java.lang.System.*;

public abstract class Tovar {

    String name;
    double price;
    String manufacturer;

    Tovar(){
        name = "";
        price = 0;
        manufacturer = "";
    }

    public Tovar(String name, double price, String manufacturer) {
        init(name, price, manufacturer);
    }

    public void input(Scanner scanner){
        out.println("Наименование: ");
        name = scanner.next();
        out.println("Цена: ");
        price = scanner.nextInt();
        scanner.nextLine();
        out.println("Производитель: ");
        manufacturer = scanner.next();
    }

    public void init(String name, double price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ",price = " + price +
                ",manufacturer = '" + manufacturer + '\'';
    }
}
