package com.company.exceptions;

public class Main {

    public static void main(String[] args) {

        ExceptionExample exceptionExample = new ExceptionExample();
        try {
            exceptionExample.example(null);
        } catch (MyException e) {
            System.out.println(e.getCode());
        }
    }
}
