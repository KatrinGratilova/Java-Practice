package hw4_Polymorphism.Figures;

public class Square implements Figure{
    private final int side;

    public Square(int width){
        this.width = width;
    }

    @Override
    public double countArea() {
        return Math.pow(width, 2);
    }
}
