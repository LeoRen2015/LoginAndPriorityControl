package com.waya.exception;

/**
 * Created by user on 2018/1/27.
 */
public class NoNumberException extends   RuntimeException{
    public NoNumberException(String message){
        super(message);
    }
    public NoNumberException(String message,Throwable cause){
        super(message,cause);
    }
}
