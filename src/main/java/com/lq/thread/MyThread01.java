package com.lq.thread;

/**
 * MyThread01
 *
 * @author qingqing
 * @date 2025/1/5
 */

public class MyThread01 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("打印第" + i);
        }
    }
}
