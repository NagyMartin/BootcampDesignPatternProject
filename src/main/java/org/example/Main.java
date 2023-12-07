package org.example;
public class Main
{
    public static void main( String[] args ){

        Oven oven = new Oven();
        Clerk clerk = new Clerk(1);
        Customer customer = new Customer();
        try {
            clerk.subscribeToOven(oven);
            customer.subscribe(clerk);
            customer.order(new Pizza.PizzaBuilder(PizzaSize.SMALL)
                    .withPizzaSauce(true)
                    .withBacon(true)
                    .withMozzarellaCheese(true)
                    .build());
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
