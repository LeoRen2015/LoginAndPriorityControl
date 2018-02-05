package com.waya.exception;

/**
 * Created by user on 2018/1/27.
 */
public class RepeatAppointException extends RuntimeException {
    public RepeatAppointException(String message) {
        super(message);
    }

    public RepeatAppointException(String message, Throwable cause) {
        super(message, cause);
    }
}
