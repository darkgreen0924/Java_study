package com.lq.method;


/**
 * @Author: Grace
 * @Date: 2024/12/28 16:25
 * @Description: TODO
 */
public class Method {
    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public int add(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

}
