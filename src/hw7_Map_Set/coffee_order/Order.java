package hw7_Map_Set.coffee_order;

public class Order {
    private int orderNumber = 0;
    private final String customerName;

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
