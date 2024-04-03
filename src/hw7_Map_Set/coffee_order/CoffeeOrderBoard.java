package hw7_Map_Set.coffee_order;

import java.util.Deque;
import java.util.LinkedList;

public class CoffeeOrderBoard {
    Deque<Order> orders;
    private static int orderCounter = 0;

    public CoffeeOrderBoard() {
        orders = new LinkedList<>();
    }

    public void add(Order order){
        orderCounter++;
        order.setOrderNumber(orderCounter);
        orders.offer(order);
    }

    public void deliver(){
        reportDelivery(orders.poll());
    }

    public void deliver(int orderNumber){
        for (Order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                orders.removeFirstOccurrence(order);
                reportDelivery(order);
                return;
            }
        }
        reportDelivery(null);
    }

    public void reportDelivery(Order deliveredOrder){
        if (deliveredOrder != null)
            System.out.println("The order №" + deliveredOrder.getOrderNumber() + " on name \"" +
                    deliveredOrder.getCustomerName() + "\" was delivered!");
        else System.out.println("There are no orders available for delivery.");
    }

    public void draw(){
        System.out.println("\nOrder number | Customer name");
        for (Order order : orders) {
            System.out.println("\t\t" + order.getOrderNumber() + " | " + order.getCustomerName());
        }
        System.out.println();
    }
}
