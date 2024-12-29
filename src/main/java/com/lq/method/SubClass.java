package com.lq.method;


/**
 * @Author: Grace
 * @Date: 2024/12/29 13:02
 * @Description: TODO
 */
public class SubClass extends SuperClass {
    {
        System.out.println("子类构造代码块");
    }

    static {
        System.out.println("子类静态代码块");
    }

    public SubClass() {
        System.out.println("子类无参构造函数");
    }

}
