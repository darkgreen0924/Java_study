package com.lq.exception;


import java.io.Serializable;

/**
 * @Author: Grace
 * @Date: 2025/2/24 19:52
 * @Description: TODO
 */
aaa
public class MyRuntimeException extends RuntimeException implements Serializable {
    @java.io.Serial
    private static final long serialVersionUID = 1L;

    public MyRuntimeException() {
        super();
    }

    public MyRuntimeException(String message) {
        super(message);
    }
}
