package com.lq.method;


/**
 * @Author: Grace
 * @Date: 2024/12/29 12:23
 * @Description: TODO
 */
public class MethodMain {
    public static void main(String[] args) {
        Method method1 = new Method();

        System.out.println(method1.add(1, 2));

        Method method2 = new Method();
        System.out.println("----------------------");

        SubClass subClass = new SubClass();
        System.out.println("----------------------");
        SubClass subClass1 = new SubClass();

    }
}
