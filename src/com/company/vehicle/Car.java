package com.company.vehicle;

import java.util.Scanner;

public class Car extends Vehicle{
    //вид кузова и количесвто мест
    String body;
    int numberOfSeats;

    Car(){
        super();
        body = "";
        numberOfSeats = 0;
    }

    Car(int enginePower, String number, String body, int numberOfSeats){
        init(enginePower, number, body, numberOfSeats);
    }

    void init(int enginePower, String number, String body, int numberOfSeats){
        super.init(enginePower, number);
        this.body = body;
        this.numberOfSeats = numberOfSeats;
    }

    void input(){
        Scanner scanner = new Scanner(System.in);
        super.input(scanner);
        System.out.print("Введите тип кузова");
        body = scanner.next();
        System.out.print("ВВедите количество мест");
        numberOfSeats = scanner.nextInt();
    }

    void input(Scanner scanner){
        super.input(scanner);
        System.out.print("Введите тип кузова");
        body = scanner.next();
        System.out.print("ВВедите количество мест");
        numberOfSeats = scanner.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nbody = " + body +
                "\nnumberOfSeats = " + numberOfSeats;
    }
}
