package org.yeachan.chapter2.item4;

/**
 * package :  org.yeachan.chapter2.item4
 * fileName : UtilClass
 * author :  ShinYeaChan
 * date : 2023-08-07
 */
public abstract class UtilClass {
    ///util 클래스라 인스턴스 생성 못하도록  막음
    private UtilClass(){
        throw new AssertionError();
    }
    public static String getName(){
        return "yeachan";
    }
//    static class AnotherClass extends  UtilClass{
//
//    }
    
    public static void main(String[] args) {
//        AnotherClass anotherClass=new AnotherClass();//abstract 클래스를 만든다고 해도 이런식으로 상속받아버리면 결국 인스턴스를 만들 수 있다..
        UtilClass.getName();
    }
}
