package com.lq.exception;


/**
 * @Author: Grace
 * @Date: 2025/2/24 19:53
 * @Description: TODO
 */
public class Account {
    public int amount = 0;

    public void save1(int money) throws MyException {
        if (money < 0) {
            throw new MyException("money is not a -");
        }
        amount += money;
    }


    public void save2(int money)  {
        if (money < 0) {
            throw new MyRuntimeException("money is not a -");
        }
        amount += money;
    }


}
