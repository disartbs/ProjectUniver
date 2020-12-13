package com.company.collections;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        NumList list = new NumList();
        list.add(new Human("sd1",new Date(1214121212121L)));
        list.add(new Human("sd2",new Date(1219121212121L)));
        list.add(new Human("sd3",new Date(1213121212121L)));
        list.add(new Human("sd4",new Date(1212121212121L)));
        list.add(new Human("sd5",new Date(1012121212121L)));
        list.add(new Human("sd6",new Date(1112121212121L)));
        // list.add(new Human("sd2",35));
      //  list.add(new Human("sd3",21));
      //  list.add(new Human("sd4",21));
       // System.out.println(list.getDifCount());
//        System.out.println(list);
        System.out.println(list.ageCount());

        list.outTreeSet();
//
        list.outMinMax();
    }
}
