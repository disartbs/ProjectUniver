package com.company.store;

import java.util.Scanner;

import static java.lang.System.*;

public class Food extends Tovar {

    int shelfLife;
    String type;

    Food(){
        super();
        shelfLife = 0;
        type = "";
    }

    @Override
    boolean equals(Tovar tovar) throws MyExceptionForStore {
        if(tovar instanceof Food)
            return this.name.equals(tovar.name)
                && this.price == tovar.price
                && this.manufacturer.equals(tovar.manufacturer)
                && this.type.equals(((Food) tovar).type)
                && this.shelfLife == ((Food) tovar).shelfLife;
        throw new MyExceptionForStore(1, "isn't Food");
    }

    public Food(String name, int price, String manufacturer, int shelfLife, String type) {
        init(name, price, manufacturer, shelfLife, type);
    }

    public void init(String name, int price, String manufacturer, int shelfLife, String type){
        super.init(name, price, manufacturer);
        this.shelfLife = shelfLife;
        this.type = type;
    }

    boolean isExpired(int date){
        return this.shelfLife < date;
    }

    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        out.println("Срок годности в формате ггггммдд: ");
        shelfLife = scanner.nextInt();
        out.println("Тип: ");
        type = scanner.next();
    }

    public void input() {
        input(new Scanner(System.in));
    }

    @Override
    public String toString() {
        return "Food " + super.toString() +
                "shelfLife = '" + shelfLife + '\'' +
                ",type = '" + type + '\'' + " ";
    }
}
