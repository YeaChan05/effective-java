package chapter2.item1;

import java.util.EnumSet;

import static chapter2.item1.Foo.Color.RED;
import static chapter2.item1.Foo.Color.WHITE;

/**
 * package :  chapter2.Foo
 * fileName : Foo
 * author :  ShinYeaChan
 * date : 2023-07-26
 */
public class Foo {
    String name;
    String address;
    
    public Foo() {
    }
    private static final Foo GOOD_NIGHT=new Foo();
    
    public Foo(String name) {
        this.name = name;
    }
    
    //    public Foo(String address) {
//        this.address = address;
//    }
    //똑같은 시그니처가 있어서 생성 불가
    public static Foo withName(String name){
        return new Foo(name);
    }
    //정적 팩토리 메서드로 시그니처 제약을 해결
    public static Foo withAddress(String address){
        Foo foo=new Foo();
        foo.address=address;
        return foo;
    }
    
    public static Foo getFoo(){
        return GOOD_NIGHT;
    }
    
    public static Foo  getFoo(boolean flag){
//        return flag?new Foo():new BarFoo();
        Foo foo =new Foo();
        //TODO 어떤 특정 약속되어 있는 텍스트 파일에서 Foo의 구현체의 FQCN(Foo Qualified Class Name)
        //TODO FQCN에 해당하는 인스턴스를 생성한다
        //TODO foo 변수를 해당 인스턴스를 가리키도록 수정한다
        //
        return foo;
    }
    
    
    public static void main(String[] args) {
        Foo foo=new Foo("yeachan");
        
        Foo foo1=Foo.withName("yeachan");//이게 더 읽기 좋다
        
        Foo foo2=Foo.getFoo();// 매번 새로운 객체를 생성하는게 아니다
        
        Foo foo3=Foo.getFoo(false); //매개변수에 따라 다른 객체를 반환(어차피 자식 객체이기만 하면 되니까)
    
        EnumSet<Color> colors=EnumSet.allOf(Color.class);
        
        EnumSet.of(RED,WHITE);
    }
//    static class BarFoo extends Foo{
//
//    }
    enum Color{
        RED,BLUE,WHITE
    }
}
