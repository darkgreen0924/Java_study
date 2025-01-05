package com.lq.thread;

import com.lq.jdbc.dto.A;

import java.util.concurrent.FutureTask;

/**
 * ThreadDemo01
 *
 * @author qingqing
 * @date 2025/1/5
 */

public class ThreadDemo01 {
    public static void main(String[] args) throws Exception {
        MyThread03 myThread03 = new MyThread03();
        FutureTask<A> ft = new FutureTask<>(myThread03);
        Thread thread = new Thread(ft);
        thread.start();
        System.out.println(ft.get());
    }
}
