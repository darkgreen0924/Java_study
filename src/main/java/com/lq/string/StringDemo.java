package com.lq.string;


/**
 * @Author: Grace
 * @Date: 2024/12/28 20:10
 * @Description: TODO
 */
public class StringDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer(10);
        stringBuffer.append("abcd");
        System.out.println(stringBuffer + ":" + stringBuffer.capacity());
        stringBuffer.append("!");
        System.out.println(stringBuffer + ":" + stringBuffer.capacity());
        stringBuffer.insert(5, "Java");
        System.out.println(stringBuffer + ":" + stringBuffer.capacity());
        stringBuffer.delete(5, 8);
        System.out.println(stringBuffer + ":" + stringBuffer.capacity());
        stringBuffer.append("efghijklmn");
        System.out.println(stringBuffer + ":" + stringBuffer.capacity());
        System.out.println(stringBuffer.substring(1, 4));
        System.out.println(stringBuffer.subSequence(1, 4));

        StringBuilder stringBuilder = new StringBuilder();

        String a = "abc";
        String b = new String("abc");
        System.out.println(a == b);
        String c = a + b;
        System.out.println(c == a);

        String d = "bcd";
        String e = "abcbcd";
        String f = a + d;
        System.out.println(f == e);

    }
}
