package hw7_Map_Set.coffee_order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard starbucksOrders = new CoffeeOrderBoard();
        
        starbucksOrders.add("Catherine");
        starbucksOrders.add("Alex L.");
        starbucksOrders.add("Marilyn Manson");
        starbucksOrders.add("Jimmy Hendrix");
        starbucksOrders.add("Lana Rey");
        starbucksOrders.add("Tatiana");
        starbucksOrders.add("Dimochka");
        starbucksOrders.add("Vasiliy Sergeevich");

        starbucksOrders.draw();

        starbucksOrders.deliver();
        starbucksOrders.deliver();
        starbucksOrders.deliver(4);
        starbucksOrders.deliver();
        starbucksOrders.deliver(4);
        starbucksOrders.deliver(7);

        starbucksOrders.draw();
    }
}
