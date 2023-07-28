package chapter2.item2;

/**
 * package :  chapter2.item2
 * fileName : Calzone
 * author :  ShinYeaChan
 * date : 2023-07-28
 */
public class Calzone extends Pizza{
    private final boolean sauceInside;
    
    public static class Builder extends Pizza.Builder<Builder>{
        private boolean sauceInside=false;
        public Builder sauceInside(){
            sauceInside=true;
            return this ;
        }
        @Override
        Calzone build() {
            return new Calzone(this);
        }
    
        @Override
        protected Builder self() {
            return this;
        }
    }
    Calzone(Builder builder) {
        super(builder);
        sauceInside= builder.sauceInside;
    }
}
