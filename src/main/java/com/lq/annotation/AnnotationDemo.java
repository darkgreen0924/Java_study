package com.lq.annotation;


import com.lq.cls.Person;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: Grace
 * @Date: 2025/2/23 14:18
 * @Description: TODO
 */
public class AnnotationDemo {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat("cat");
        Dog dog = new Dog("dog");
        importClassPrint(cat);
        importClassPrint(dog);

        Method[] declaredMethods = dog.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(ImportantMethod.class)) {
                int times = declaredMethod.getAnnotation(ImportantMethod.class).times();
                for (int i = 0; i < times; i++) {
                    Object invoke = declaredMethod.invoke(dog, null);
                }
            }
        }

        Field[] declaredFields = dog.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(ImportantString.class)) {
                System.out.println(declaredField.getName());
            }
        }
        @SuppressWarnings("unused")
        Person p = new Person();

    }

    public static void importClassPrint(Animal animal) {
        if (animal.getClass().isAnnotationPresent(ImportantClass.class)) {
            System.out.println(animal.getClass().getName() + ":important");
        } else {
            System.out.println(animal.getClass().getName() + ":not important");
        }
    }
}
