package com.company.generics;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Matrix<Double> arr = new Matrix<>(new Double[]{1.1,5.0, 1.2, 3.3, 5.0,5.0});
        System.out.println(arr);
        System.out.println(arr.coutOfMax());
        System.out.println(arr.coutOfMax1());
    }
}
