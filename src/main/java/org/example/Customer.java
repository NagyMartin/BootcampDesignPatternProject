package org.example;
/**
 * Customer Object Class, created using the behavioral mediator design pattern.
 * The customer subscribes to a clerk, which then can place an order to the clerk and receives it back once it
 * is completed.
*/
import lombok.Getter;

@Getter
public class Customer {
    private static int counter =1;
    protected int customerNumber = counter;
    private void counter(){
        counter++;
    }
    public Customer() {
        counter();
    }

    protected Clerk clerk;
    private Pizza pizza;
    public void order(Pizza pizza){
        this.pizza = pizza;
        try{
        if(pizza!=null) {
            System.out.println("Customer: Hello, I would like to order a : " + pizza);
            notifyClerk(pizza, customerNumber);
        }
        } catch(RuntimeException e){
            System.out.println("There is no pizza order. Choose a pizza.");
        }
    }

    private void notifyClerk(Pizza pizza, int customerNumber){
        this.pizza = pizza;
        this.customerNumber = customerNumber;
        clerk.receiveOrder(pizza, customerNumber);
    }

    public void getPizzaOrder(Pizza pizza){
        System.out.println("Customer: Thank you!");
    }
    public void subscribe(Clerk clerk){
        clerk.subscribe(this);
        this.clerk = clerk;
    }

    public void unsubscribe(Clerk clerk){
        clerk.unsubscribe(this);
    }
}
