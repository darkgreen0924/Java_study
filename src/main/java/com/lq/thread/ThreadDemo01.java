package com.lq.thread;

import com.lq.jdbc.dto.A;

import java.util.concurrent.*;

/**
 * ThreadDemo01
 *
 * @author qingqing
 * @date 2025/1/5
 */

public class ThreadDemo01 {
    public static void main(String[] args) throws Exception {
        MyThread03 myThread03 = new MyThread03();
//        FutureTask<A> ft = new FutureTask<>(myThread03);
//        Thread thread = new Thread(ft);
//        thread.start();
//        System.out.println(ft.get());

        ExecutorService executor = new ThreadPoolExecutor(1,
                1,
                10L,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(1),
                new ThreadPoolExecutor.AbortPolicy());

        Future<A> submit1 = executor.submit(myThread03);
        Future<A> submit2 = executor.submit(myThread03);
        Future<A> submit3 = executor.submit(myThread03);
//        Future<A> submit4 = executor.submit(myThread03);
//        Future<A> submit5 = executor.submit(myThread03);
//        Future<A> submit6 = executor.submit(myThread03);
//        System.out.println(submit1.get());
//        System.out.println(submit2.get());

        executor.shutdown();

    }
}
