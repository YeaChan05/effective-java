package org.yeachan.chapter2.item3;

/**
 * package :  org.yeachan.chapter2.item3
 * fileName : Singleton2
 * author :  ShinYeaChan
 * date : 2023-07-29
 */
public class Singleton2 {
    private static final Singleton2 instance=new Singleton2();
    private Singleton2(){
    
    }
    public static Singleton2 getInstance(){
        return instance;
    }
}
