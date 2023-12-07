package org.example;
/**
 * Oven Object Class, created using the behavioral mediator design pattern.
 * The oven has a list of subscribed clerks that send orders to it to be completed.
 * Once the order is completed, it sends the order back to the clerk for further processing.
 */

import java.util.ArrayList;
import java.util.List;

public class Oven {
    private List<Clerk> clerkList = new ArrayList<>();
    int ovenCapacity = 5000;
    private Pizza pizza;

    public void ovenHandle(Pizza pizza, int customerNumber) {
        int pizzaQuantity = pizza.getSize().getGrams();
        int cookDurationInSeconds = pizza.getSize().getCookDurationInSeconds();
        try {
            if (ovenCapacity >= pizzaQuantity) {
                System.out.println("Pizza is currently in the oven.");
                ovenCapacity -= pizzaQuantity;
                Thread.sleep(cookDurationInSeconds * 1000L);
                alertClerk(pizza, customerNumber);
            } else {
                System.out.println("There is no space in the oven at the moment.");
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void alertClerk(Pizza pizza, int customerNumber){
            for(Clerk clerk:clerkList){
                clerk.serveCustomer(pizza, customerNumber);
            }
    }

    public void subscribe(Clerk clerk){
        clerkList.add(clerk);
    }

    public void unsubscribe(Clerk clerk){
        clerkList.remove(clerk);
    }

}
