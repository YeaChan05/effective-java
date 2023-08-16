package org.yeachan.chapter2.item6.autoboxing;

/**
 * package :  org.yeachan.chapter2.item6.autoboxing
 * fileName : AutoBoxingExample
 * author :  ShinYeaChan
 * date : 2023-08-16
 */
public class AutoBoxingExample {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Long sum=0L;
//        long sum=0L;//시간차이 거의 10배!
        for (long i = 0; i <=Integer.MAX_VALUE; i++) {
            sum+=i;
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis()-start);
    }
}