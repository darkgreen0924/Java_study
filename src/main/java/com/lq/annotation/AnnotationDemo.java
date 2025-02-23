package com.lq.annotation;


/**
 * @Author: Grace
 * @Date: 2025/2/23 14:18
 * @Description: TODO
 */
public class AnnotationDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("cat");
        Dog dog = new Dog("dog");
        importClassPrint(cat);
        importClassPrint(dog);
    }

    public static void importClassPrint(Animal animal) {
        if (animal.getClass().isAnnotationPresent(ImportantClass.class)) {
            System.out.println(animal.getClass().getName() + ":important");
        } else {
            System.out.println(animal.getClass().getName() + ":not important");
        }
    }
}
