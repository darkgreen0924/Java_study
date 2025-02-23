package com.lq.reflect;

import com.lq.annotation.ImportantString;
import lombok.Data;

/**
 * Person
 *
 * @author qingqing
 * @date 2025/2/23
 */

@Data
public class Person {
    @ImportantString
    private String field;

    private Person() {
    }

    public Person(String field) {
        this.field = field;
    }

    public Integer method() {
        System.out.println(".....");
        return 1;
    }
}
