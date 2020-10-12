package com.company.store;

import java.util.Arrays;
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

    public  void input(){//Сделать добавление товара по желанию в whil
        Scanner scanner = new Scanner(System.in);
        input(scanner);
    }

    private void input(Scanner scanner) {
        System.out.println("Название отдела: ");
        name = scanner.next();
        while (true) {
            System.out.println("1 - ввести товар, 2 - break");
            int i = scanner.nextInt();
            switch (i){
                case 1 : inputTovar();
                case 2 : break;
            }
        }
    }

    public void  inputTovar(){
       inputTovar(new Scanner(System.in));
    }

    public void  inputTovar(Scanner scanner){
        System.out.println("Вид товара: 1 - Продовольственный, 2 - промышленный");
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


    int countExpired(int date){
        int count = 0;
        for(Tovar tovar : tovars)
            if(tovar instanceof Food &&  ((Food) tovar).isExpired(date))
                count++;

        return count;
    }

    @Override
    public String toString() {
        return "Otdel " +
                "name = '" + name + '\'' +
                ",tovars = " + Arrays.toString(tovars);
    }

    public void deleteTovar(int i) {
        Tovar[] newTovars = new Tovar[tovars.length - 1];
       // for(int i )
    }
}