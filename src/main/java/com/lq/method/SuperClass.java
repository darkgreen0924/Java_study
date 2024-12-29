package com.lq.method;


/**
 * @Author: Grace
 * @Date: 2024/12/29 13:02
 * @Description: TODO
 */
public class SuperClass  {
    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类构造代码块");
    }

    public SuperClass() {
        System.out.println("父类构造函数");
    }
}
