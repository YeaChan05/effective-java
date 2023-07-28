package chapter2.item2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * package :  chapter2.item2
 * fileName : Pizza
 * author :  ShinYeaChan
 * date : 2023-07-28
 */
public abstract class Pizza {
    public enum Topping{
        HAM, MUSHROOM,ONION,PEPPER,SAUSAGE
    }
    final Set<Topping> toppings;
    abstract static class Builder<T extends Builder<T>>{//재귀적 타입 매개변수
        EnumSet<Topping> toppings=EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        abstract Pizza build();//실제로는 Pizza의 하위 타입을 반환하게된다
        protected abstract T self();
    }
    Pizza(Builder<?> builder) {
        toppings=builder.toppings.clone();
    }
}
