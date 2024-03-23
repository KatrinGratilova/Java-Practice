package hw4_Polymorphism.Figures;

public class Triangle implements Figure{
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if(!isTriangle()) System.out.println("This is not a triangle");
    }

    private boolean isTriangle(){
        return sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA;
    }

    @Override
    public double countArea() {
        if(!isTriangle()) return 0;
        double halfPerimeter = (double) (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) *
                (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }
}
