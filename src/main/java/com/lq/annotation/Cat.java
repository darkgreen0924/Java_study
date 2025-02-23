package com.lq.annotation;


/**
 * @Author: Grace
 * @Date: 2025/2/23 14:18
 * @Description: TODO
 */
public class Cat implements Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void crew(){
        System.out.println("miao miao");
    }
}
