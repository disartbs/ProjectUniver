package com.company.zoo.exceptions;

public class NotEqualsException extends Exception{

    int code;

    public NotEqualsException(int code){
        super(selectMessage(code));
        this.code = code;
    }

    private static String selectMessage(int code) {
        switch (code){
            case 0 : return "Isn't Animal";
            case 1 : return "Isn't Fish";
            case 2 : return "Isn't Snake";
        }
        return "Default";
    }
}
