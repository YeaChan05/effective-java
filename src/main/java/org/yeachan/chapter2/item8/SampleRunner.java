package org.yeachan.chapter2.item8;/**
 * package :  org.yeachan.chapter2.item8
 * fileName : SampleRunner
 * author :  ShinYeaChan
 * date : 2023-10-16
 */public class SampleRunner {
//    public static void main(String[] args) throws InterruptedException {
//        SampleRunner runner=new SampleRunner();
//        runner.run();
//        Thread.sleep(1000l);
//    }
//
//    private void run() {
//        FinalizerExample finalizerExample=new FinalizerExample();
//        finalizerExample.hello();
//    }
    public static void main(String[] args) {
        try(SampleResource sampleResource=new SampleResource()) {
            sampleResource.hello();
        }
    }
}
