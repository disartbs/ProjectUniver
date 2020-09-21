package com.company.vehicle;

import java.util.Scanner;

public class Truck extends Vehicle{
    //тоннаж и тип кузова
    String body;
    int tonnage;

    Truck(){
        super();
        body = "";
        tonnage = 0;
    }

    Truck(int enginePower, String number, String body, int tonnage){
        init(enginePower, number, body, tonnage);
    }

    void init(int enginePower, String number, String body, int tonnage){
        super.init(enginePower, number);
        this.body = body;
        this.tonnage = tonnage;
    }

    void input(){
        Scanner scanner = new Scanner(System.in);
        super.input(scanner);
        System.out.print("Введите тип кузова");
        body = scanner.next();
        System.out.print("ВВедите тоннаж");
        tonnage = scanner.nextInt();
    }

    void input(Scanner scanner){
        super.input(scanner);
        System.out.print("Введите тип кузова");
        body = scanner.next();
        System.out.print("ВВедите тоннаж");
        tonnage = scanner.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nbody = " + body +
                "\ntonnage = " + tonnage;
    }
}
