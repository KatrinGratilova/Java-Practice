package hw4_Polymorphism.Figures;

public class Circle implements Figure {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double countArea() {
        return 3.14 * Math.pow(radius, 2);
    }
}
