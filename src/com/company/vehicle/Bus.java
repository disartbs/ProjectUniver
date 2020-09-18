package com.company.vehicle;

import java.util.Scanner;

public class Bus extends Vehicle{

    char comfort;
    int capacity;

    Bus(){
        super();
        comfort = '_';
        capacity = 0;
    }

    Bus(int enginePower, String number, char comfort, int capacity){
        init(enginePower, number, comfort, capacity);
    }

    void init(int enginePower, String number, char comfort, int capacity){
        super.init(enginePower, number);
        this.comfort = comfort;
        this.capacity = capacity;
    }

    void input(){
        Scanner scanner = new Scanner(System.in);
        super.input(scanner);
        System.out.print("Введите класс комфорта");
        comfort = scanner.next().charAt(0);
        System.out.print("ВВедите вместимость");
        capacity = scanner.nextInt();
    }

    void input(Scanner scanner){
        super.input(scanner);
        System.out.print("Введите класс комфорта");
        comfort = scanner.next().charAt(0);
        System.out.print("ВВедите вместимость");
        capacity = scanner.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncomfort = " + comfort +
                "\ncapacity = " + capacity;
    }
}
