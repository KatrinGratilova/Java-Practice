package hw4_Polymorphism.Figures;

public class Square implements Figure{
    private final int side;

    public Square(int width){
        this.side = width;
    }

    @Override
    public double countArea() {
        double area = Math.pow(side, 2);
        return area;
    }
}
