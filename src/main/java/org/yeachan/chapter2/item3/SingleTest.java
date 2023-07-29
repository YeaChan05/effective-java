package org.yeachan.chapter2.item3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

/**
 * package :  org.yeachan.chapter2.item3
 * fileName : SingleTest
 * author :  ShinYeaChan
 * date : 2023-07-29
 */
public class SingleTest {
    public static void main(String[] args) {
//        Singleton1 singleton1 =Singleton1.instance;
//        Constructor<Singleton1> constructor = Singleton1.class.getConstructor();//리플렉션 예시
//        constructor.setAccessible(true);
//        Singleton1 singleton2 = constructor.newInstance();//이런식으로 생성자를 만들 수도 있잖아
        Singleton2 singleton1 =Singleton2.getInstance();
        Singleton2 singleton2 =Singleton2.getInstance();
        Supplier<Singleton2> s2supplier = Singleton2::getInstance;//필요에 의해 제네릭 싱글톤 팩토리로 만들 수도 있다
        
        String name=Singleton3.INSTANCE.getName();
    
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
        UserService userService1 = applicationContext.getBean(UserService.class);
        UserService userService2 = applicationContext.getBean(UserService.class);
        System.out.println(userService1==userService2);
    }
}
