package hw2;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Katrin", "Gratilova", "Oleksandrovna",
                "Java Junior", "gr.katrin.05@gmail.com", "+380632546866", 18);
        System.out.println(emp1);

        Car car1 = new Car("BMW", "e55");
        car1.start();

        hw2.package1.SameName obj1 = new hw2.package1.SameName();
        hw2.package2.SameName obj2 = new hw2.package2.SameName();
        obj1.checkPackage();
        obj2.checkPackage();

    }
}