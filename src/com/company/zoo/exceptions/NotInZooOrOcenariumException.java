package com.company.zoo.exceptions;

public class NotInZooOrOcenariumException extends Exception {

    int code;

    public NotInZooOrOcenariumException(int code){
        super(selectMessage(code));
        this.code = code;
    }

    private static String selectMessage(int code) {
        switch (code){
            case 0 : return "Entity haven't income date";
            case 1 : return "Entity isn't in Zoo";
            case 2 : return "Entity isn't in Oceanarium";
        }
        return "Default";
    }
}
