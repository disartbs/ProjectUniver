package com.company.store;

class MyExceptionForStore extends Exception {

    int code;

    public MyExceptionForStore(String message) {
        this(0, message);
    }

    public MyExceptionForStore(int code, String message){
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
