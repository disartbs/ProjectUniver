package com.company.exceptions;

class MyException extends Exception {

    int code;

    public MyException(String message) {
        this(0, message);
    }

    public MyException(int code, String message){
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
