package org.yeachan.chapter2.item3;

/**
 * package :  org.yeachan.chapter2.item3
 * fileName : Singleton1
 * author :  ShinYeaChan
 * date : 2023-07-29
 */
public class Singleton1 {
    public static final  Singleton1 instance=new Singleton1();//리플렉션을 이용하면 여러개 가능하잖아,,
    int count;
    private Singleton1(){
        //리플렉션을 막기 위한 조치
        count++;
        if(count!=1){
            throw new IllegalStateException();
        }
    }
}
