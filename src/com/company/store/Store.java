package com.company.store;

import com.company.exceptions.ExceptionExample;

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


    void deleteTovar(Tovar tovar) throws MyExceptionForStore {
        for(Otdel otdel : otdels){
            for(int i = 0; i < otdel.tovars.length; i++){
                if(otdel.tovars[i].equals(tovar)){
                    otdel.deleteTovar(i);
                    return;
                }

            }
        }
        throw new MyExceptionForStore(3, "Not Found");
    }

    Otdel getOtdelWithMaxCountExpiredTovars(int date){
        Otdel otdel = null;
        int count;
        int max = -1;
        for(Otdel otdel1 : otdels){
            count = otdel1.countExpired(date);
            if(count > max){
                otdel = otdel1;
                max = count;
            }
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
                    addOtdel();
                case 2:
                    break;
            }
        }
    }

    void addOtdel(Otdel otdel){
        Otdel[] newOtdels = new Otdel[otdels.length];
        for(int i = 0; i < otdels.length; i++){
            newOtdels[i] = otdels[i];
        }
        newOtdels[newOtdels.length - 1] = otdel;
        otdels = newOtdels;
    }

    void addOtdel(){
        Otdel otdel = new Otdel();
        otdel.input();
        Otdel[] newOtdels = new Otdel[otdels.length];
        for(int i = 0; i < otdels.length; i++){
            newOtdels[i] = otdels[i];
        }
        newOtdels[newOtdels.length - 1] = otdel;
        otdels = newOtdels;
    }
}
