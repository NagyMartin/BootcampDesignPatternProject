package org.example;
/**
 * Clerk Object Class, created using the behavioral mediator design pattern.
 * The clerk has a list of subscribed customers and also in its turn, it subscribes to an oven.
 * The clerk receives an order from the customer which in turn sends it to the oven, after
 * the order is processed by the oven and sent back to the clerk, it sends the order to the
 * respective customer that made it.
 */

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class Clerk {
    private int clerkId;
    public Clerk(){

    }
    public Clerk(int clerkId) {
        this.clerkId = clerkId;
    }

    private List<Customer> customerList = new ArrayList<>();
    protected Oven oven;

    public void receiveOrder(Pizza order, int customerNumber){
        if(order!=null) {
            int cookDurationInSeconds = order.getSize().getCookDurationInSeconds();
            System.out.println("Clerk: Of course, your number is: " + customerNumber + " Order will take about: " + cookDurationInSeconds
            + " seconds.");
            oven.ovenHandle(order, customerNumber);
        }else{
            System.out.println("Clerk: Can I have your order please?");
        }
    }

    public void subscribe(Customer customer){
        customerList.add(customer);
    }
    public void unsubscribe(Customer customer){
        customerList.remove(customer);
    }

    public void subscribeToOven(Oven oven){
        oven.subscribe(this);
        this.oven = oven;
    }

    public void unsubscribeFromOven(Oven oven){
        oven.unsubscribe(this);
    }

    public void serveCustomer(Pizza pizza, int customerNumber) {
        oven.ovenCapacity += pizza.getSize().getGrams();
        for (Customer customer: customerList) {
            if(customer.getCustomerNumber()==customerNumber) {
                System.out.println("Clerk: Customer number: "+ customerNumber + ". The pizza is ready " + pizza);
                customer.getPizzaOrder(pizza);
            }
        }
    }
}
