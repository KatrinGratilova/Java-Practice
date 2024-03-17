
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Katrin", "Gratilova", "Oleksandrovna",
                "Java Junior", "gr.katrin.05@gmail.com", "+380632546866", 18);
        System.out.println(emp1);

        Car car1 = new Car("BMW", "e55");
        System.out.println(car1.getBrand());

        SameName_package1.SameName obj1 = new SameName_package1.SameName();
        SameName_package2.SameName obj2 = new SameName_package2.SameName();

    }
}