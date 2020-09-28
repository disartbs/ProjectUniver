package com.company.vehicle;

import java.util.Scanner;

public abstract class Vehicle {
    int enginePower;
    String number;

    Vehicle() {
        enginePower = 0;
        number = "_";
    }

    Vehicle(int enginePower, String number) {
        this.init(enginePower, number);
    }

    void init(int enginePower, String number) {
        this.enginePower = enginePower;
        this.number = number;
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите мощность");
        enginePower = scanner.nextInt();
        scanner.nextLine(); //После предыдущего ввода остался Enter в потоке.
        // Мы его считали и теперь его нет. Можно вводить альше
        System.out.print("Введите номер");
        number = scanner.nextLine();
    }

    void input(Scanner scanner) {
        System.out.print("Введите мощность");
        enginePower = scanner.nextInt();
        scanner.nextLine(); //После предыдущего ввода остался Enter в потоке.
        // Мы его считали и теперь его нет. Можно вводить альше
        System.out.print("Введите номер");
        number = scanner.nextLine();
    }


    @Override
    public String toString() {
        return "\n\nenginePower = " + enginePower + "\nnumber = " + number;
    }
}
