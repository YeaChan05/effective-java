package org.yeachan.chapter2.item8;

/**
 * package :  org.yeachan.chapter2.item8
 * fileName : FinalizerExample
 * author :  ShinYeaChan
 * date : 2023-10-16
 */
public class FinalizerExample {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Clean up");
    }
    
    public void hello() {
        System.out.println("hi");
    }
}
