package com.company.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;

public class Matrix<T extends Number> {
    private T[] array;

    public Matrix(T[] array) {
        this.array = array.clone();
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    int coutOfMax1(){
        Optional<T> optionalT = Arrays.stream(array).max((a, b) -> {
            if(a.doubleValue() == b.doubleValue())
                return 0;
            return a.doubleValue() > b.doubleValue() ? 1 : -1;
        });
        if(optionalT.isEmpty())
            return 0;
        int count = 0;
        double max = optionalT.get().doubleValue();
        for (T t : array) {
            if(t.doubleValue() == max)
                count++;
        }
        return count;
    }

    int coutOfMax(){
        Optional<T> max1 = Arrays.stream(array).max((a, b) -> {
            if(a.doubleValue() == b.doubleValue())
                return 0;
            return a.doubleValue() > b.doubleValue() ? 1 : -1;
        });
        if(array == null || array.length == 0)
            return 0;
        if(array.length == 1)
            return 1;
        double max = array[0].doubleValue();
        int count = 0;
        for (int i = 1, arrayLength = array.length; i < arrayLength; i++) {
            T t = array[i];
            if (t.doubleValue() > max) {
                max = t.doubleValue();
                count = 1;
                continue;
            }
            if (t.doubleValue() == max) {
                count++;
            }
        }
        return count;
    }
}
