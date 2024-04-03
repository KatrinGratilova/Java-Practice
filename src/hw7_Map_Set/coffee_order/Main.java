package hw7_Map_Set.coffee_order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard starbucksOrders = new CoffeeOrderBoard();
        
        starbucksOrders.add(new Order("Catherine"));
        starbucksOrders.add(new Order("Alex L."));
        starbucksOrders.add(new Order("Marilyn Manson"));
        starbucksOrders.add(new Order("Jimmy Hendrix"));
        starbucksOrders.add(new Order("Lana Rey"));
        starbucksOrders.add(new Order("Tatiana"));
        starbucksOrders.add(new Order("Dimochka"));
        starbucksOrders.add(new Order("Vasiliy Sergeevich"));

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
