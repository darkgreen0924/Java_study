package com.lq.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ReflectDemo
 *
 * @author qingqing
 * @date 2025/2/23
 */

public class ReflectDemo {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException,
            IllegalAccessException, NoSuchMethodException {
        Class<Person> personClass = Person.class;
        Field[] declaredFields = personClass.getDeclaredFields();
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();

        Constructor<Person> constructor = personClass.getConstructor(String.class);
        Person person = constructor.newInstance("abc");

        Method[] declaredMethods = personClass.getDeclaredMethods();

        System.out.println(person.toString());

        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
        }

        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
            for (Annotation annotation : declaredField.getAnnotations()) {
                System.out.println(annotation.annotationType());
            }
        }

        Method method = personClass.getMethod("method");
        Object invoke = method.invoke(person, null);
        System.out.println(invoke);

    }
}
