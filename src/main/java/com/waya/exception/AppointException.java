package com.waya.exception;

/**
 * Created by user on 2018/1/27.
 */
public class AppointException extends RuntimeException{
    public AppointException(String message) {
        super(message);
    }

    public AppointException(String message, Throwable cause) {
        super(message, cause);
    }
}
