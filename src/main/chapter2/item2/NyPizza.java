package chapter2.item2;

import java.util.Objects;

/**
 * package :  chapter2.item2
 * fileName : NyPizza
 * author :  ShinYeaChan
 * date : 2023-07-28
 */
public class NyPizza extends Pizza{
    public enum Size {
        SMALL,MEDIUM,LARGE
    }
    private final Size size;
    public static class Builder extends Pizza.Builder<Builder>{
        private final Size size;
    
        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }
    
        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }
    
        @Override
        protected Builder self() {
            return this;
        }
    }
    
    NyPizza(Builder builder) {
        super(builder);
        size=builder.size;
    }
    
}
