package com.lq.exception;


/**
 * @Author: Grace
 * @Date: 2025/2/24 19:55
 * @Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            account.save1(-1);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }


        account.save2(-1);
    }
}
