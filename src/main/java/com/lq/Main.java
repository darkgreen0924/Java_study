package com.lq;

import com.lq.cls.Person;
import com.lq.enum1.Gender;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person lq = new Person("lq", 24, Gender.MALE);
        System.out.println(lq.toString());
    }
}