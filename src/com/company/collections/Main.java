package com.company.collections;

public class Main {

    public static void main(String[] args) {
        NumList list = new NumList();
        list.add(new Human("sd1"));
        list.add(new Human("sd2"));
        list.add(new Human("sd3"));
        // list.add(new Human("sd2",35));
      //  list.add(new Human("sd3",21));
      //  list.add(new Human("sd4",21));
       // System.out.println(list.getDifCount());
//        System.out.println(list);
//        list.outTreeSet();
//
        list.outMinMax();
    }
}
