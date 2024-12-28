package com.lq.cls;


import com.alibaba.fastjson2.JSONObject;

import java.util.Objects;

import com.lq.enum1.Gender;

/**
 * @Author: Grace
 * @Date: 2024/12/28 17:20
 * @Description: TODO
 */
public class Person {
    private String name;
    private Integer age;
    private Gender gender;

    public Person() {
    }

    public Person(String name, Integer age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age) && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender.getDescription() +
                '}';
    }
}
