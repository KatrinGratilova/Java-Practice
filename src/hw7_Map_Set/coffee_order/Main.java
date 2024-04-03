package hw7_Map_Set.coffee_order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orders = new CoffeeOrderBoard();
        orders.add(new Order("Catherine"));
        orders.add(new Order("Alex L."));
        orders.add(new Order("Marilyn Manson"));
        orders.add(new Order("Jimmy Hendrix"));
        orders.add(new Order("Lana Rey"));
        orders.add(new Order("Tatiana"));
        orders.add(new Order("Dimochka"));
        orders.add(new Order("Vasiliy Sergeevich"));

        orders.draw();

        orders.deliver();
        orders.deliver();
        orders.deliver(4);
        orders.deliver();
        orders.deliver(4);
        orders.deliver(7);

        orders.draw();
    }
}
