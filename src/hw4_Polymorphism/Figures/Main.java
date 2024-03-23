package hw4_Polymorphism.Figures;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                new Circle(5),
                new Square(6),
                new Triangle(3, 4, 5)
        };

        for (Figure figure: figures){
            System.out.println(figure.countArea());
        }
        System.out.println("The sum of figure areas = " + countSumOfAreas(figures));

    }

    public static double countSumOfAreas(Figure[] figures){
        double sum = 0;
        for (Figure figure: figures){
            sum += figure.countArea();
        }
        return sum;
    }
}
