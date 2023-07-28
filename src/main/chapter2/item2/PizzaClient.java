package chapter2.item2;

/**
 * package :  chapter2.item2
 * fileName : PizzaClient
 * author :  ShinYeaChan
 * date : 2023-07-28
 */
public class PizzaClient {
    public static void main(String[] args) {
        NyPizza nyPizza=new NyPizza.Builder(NyPizza.Size.MEDIUM)
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.ONION)
                .build();
        Calzone calzone =new Calzone.Builder()
                .addTopping(Pizza.Topping.ONION)
                .sauceInside()
                .build();
    }
}
