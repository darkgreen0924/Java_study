package com.lq.thread;

import com.lq.jdbc.dto.A;

import java.util.concurrent.Callable;

/**
 * MyThread03
 *
 * @author qingqing
 * @date 2025/1/5
 */

public class MyThread03 implements Callable<A> {
    @Override
    public A call() throws Exception {
        System.out.println("start");
        Thread.sleep(1000L);
        return new A(1, "lq");
    }
}
