package com.lq.annotation;


/**
 * @Author: Grace
 * @Date: 2025/2/23 14:18
 * @Description: TODO
 */

@ImportantClass
public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void crew() {
        System.out.println("wang wang");
    }
}
