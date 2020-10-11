package com.company.store;

import java.util.Scanner;

public class Store {

    String name;
    String address;
    Otdel[] otdels;

    public Store() {
        this.name = "";
        this.address = "";
        this.otdels = new Otdel[0];
    }

    public Store(String name, String address, Otdel[] otdels) {
        init(name, address, otdels);
    }

    public void init(String name, String address, Otdel[] otdels) {
        this.name = name;
        this.address = address;
        this.otdels = otdels;
    }

    Otdel getOtdelWithMaxCountExpiredTovars(int date){
        Otdel otdel = null;
        int max = -1;
        for(Otdel otdel1 : otdels){
            if(otdel1.countExpired(date) > max)
                otdel = otdel1;
        }
        return otdel;
    }

    void input(Scanner scanner) {
        System.out.println("Название: ");
        name = scanner.next();
        System.out.println("Адрес: ");
        address = scanner.next();
        while (true) {
            System.out.println("1 - ввести отдел, 2 - break");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    addOtdel((new Otdel()));
                case 2:
                    break;
            }
        }
    }

    void addOtdel(Otdel otdel){
        otdel.input();
        Otdel[] newOtdels = new Otdel[otdels.length];
        for(int i = 0; i < otdels.length; i++){
            newOtdels[i] = otdels[i];
        }
        newOtdels[newOtdels.length - 1] = otdel;
        otdels = newOtdels;
    }
}
