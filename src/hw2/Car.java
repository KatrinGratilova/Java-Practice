package hw2;

public class Car {
    private final String brand;
    private final String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity(){
        System.out.println("Starting electricity...");
    }

    private void startCommand(){
        System.out.println("Starting command...");
    }

    private void startFuelSystem(){
        System.out.println("Starting fuel system...");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

}
