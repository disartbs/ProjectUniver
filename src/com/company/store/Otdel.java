package com.company.store;

import java.util.Scanner;

public class Otdel {

    String name;
    Tovar[] tovars;

    public Otdel(){
        name = "";
        tovars = new Tovar[0];
    }

    public Otdel(String name) {
        this.name = name;
    }

    public Otdel(String name, Tovar[] tovars) {
        this.name = name;
        this.tovars = tovars;
    }

    public void addTovar(Tovar tovar){
        Tovar[] newTovars = new Tovar[tovars.length];
        for(int i = 0; i < tovars.length; i++){
            newTovars[i] = tovars[i];
        }
        newTovars[newTovars.length - 1] = tovar;
        tovars = newTovars;
    }

    public  void input(){//Сделать добавление товара по желанию в while
        System.out.println("Название отдела: ");
    }

    void output(){//Название отдела и элементы в цикле

    }

    public void  inputTovar(){
        System.out.println("Вид товара: 1 - Продовольственный, 2 - промышленный");
        Scanner scanner =  new Scanner(System.in);
        int type = scanner.nextInt();
        Tovar tovar;
        switch (type){
            case 1: tovar = new Food();
            case 2: tovar = new Goods();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        tovar.input(scanner);
        addTovar(tovar);
    }

    int countIsExpired(int date){
        int count = 0;
        for(Tovar tovar : tovars)
            if(tovar instanceof Food &&  ((Food) tovar).isExpired(date))
                count++;

        return count;
    }

}