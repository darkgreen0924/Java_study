package com.lq.jdbc.dto;

/**
 * A
 *
 * @author qingqing
 * @date 2024/12/31
 */

public class A {
    private Integer id;
    private String name;

    public A(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
