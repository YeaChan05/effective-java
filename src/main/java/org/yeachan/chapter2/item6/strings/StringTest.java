package org.yeachan.chapter2.item6.strings;

/**
 * package :  org.yeachan.chapter2.item6.strings
 * fileName : StringTest
 * author :  ShinYeaChan
 * date : 2023-08-16
 */
public class StringTest {
    public static void main(String[] args) {
        Boolean true1 = Boolean.valueOf("true");
        Boolean true2 = Boolean.valueOf("true");
        System.out.println(true1==true2);
        System.out.println(true1==Boolean.TRUE);
    }
}
