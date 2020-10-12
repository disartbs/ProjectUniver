package com.company.exceptions;

public class ExceptionExample {

    String example(String str) throws MyException {
        if(str == null) {
            throw new MyException(10, "null");
        }
        return "hello" + str ;
    }
}
