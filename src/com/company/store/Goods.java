package com.company.store;

import java.util.Scanner;

public class Goods extends Tovar {

    String country;

    Goods(){
        super();
        country = "";
    }

    public Goods(String name, double price, String manufacturer, String country) {
        init(name, price, manufacturer, country);
    }

    public void init(String name, double price, String manufacturer, String country) {
        super.init(name, price, manufacturer);
        this.country = country;
    }

    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.println("Страна: ");
    }

    public void input(){
        input(new Scanner(System.in));
    }

    @Override
    public String toString() {
        return "Goods " + super.toString() +
                "country = '" + country + '\'';
    }
}
