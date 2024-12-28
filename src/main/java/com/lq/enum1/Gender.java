package com.lq.enum1;


/**
 * @Author: Grace
 * @Date: 2024/12/28 17:22
 * @Description: TODO
 */
public enum Gender {
    FEMALE("female"), MALE("male");

    private final String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
