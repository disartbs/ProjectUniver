package com.company.lambda;

import java.util.*;

public class Main {
    static List<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        remove(1,3);
        System.out.println(list);
        Date currentTime = Calendar.getInstance().getTime();
        System.out.println(currentTime.getTime());
    }

    static void remove(int from, int to){
        int localIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if(localIndex>=from && localIndex<to)
                list.remove(localIndex);
            localIndex++;
        }
    }
}
