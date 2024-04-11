package hw9_Stream;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                Product.builder("Bottle", 250)
                        .id(1).isDiscountApplicable(true)
                        .addDate(LocalDate.of(2024, 2, 23)).build(),
                Product.builder("Book", 112)
                        .id(2).isDiscountApplicable(true)
                        .addDate(LocalDate.of(2023, 12, 13)).build(),
                Product.builder("Book", 748)
                        .id(3).isDiscountApplicable(false)
                        .addDate(LocalDate.of(2024, 9, 30)).build(),
                Product.builder("Bottle", 51)
                        .id(4).isDiscountApplicable(true)
                        .addDate(LocalDate.of(2021, 4, 10)).build(),
                Product.builder("Mirror", 220)
                        .id(5).isDiscountApplicable(true)
                        .addDate(LocalDate.of(2022, 5, 5)).build(),
                Product.builder("Book", 342)
                        .id(6).isDiscountApplicable(true)
                        .addDate(LocalDate.of(2024, 2, 26)).build(),
                Product.builder("Book", 30)
                        .id(7).isDiscountApplicable(false)
                        .addDate(LocalDate.of(2024, 2, 9)).build(),
                Product.builder("Book", 67)
                        .id(8).isDiscountApplicable(true)
                        .addDate(LocalDate.of(2024, 11, 1)).build()));

        System.out.println("Books that are more expensive than 250 USD:");
        findExpensiveBooks(products).forEach(Product::printTypePrice);

        System.out.println("\nDiscount applicable books with discount 10%:");
        applyDiscountForBooks(products).forEach(Product::printTypePriceDiscount);

        System.out.println("\nThe cheapest book:");
        findTheCheapestBook(products).printTypePriceDiscount();

        System.out.println("\nThree last added products:");
        findThreeLastProducts(products).forEach(Product::printTypePriceDiscountDate);

        System.out.print("\nThe general price of cheap books of 2024: ");
        System.out.println(calculateGeneralPrice(products));

        System.out.println("\nGrouped products by their type:");
        groupByType(products)
                .forEach((k, v) -> {
                    System.out.println("\"" + k + "\": ");
                    v.forEach(System.out::println);
                });
    }

    public static List<Product> findExpensiveBooks(List<Product> products){
        return products.stream()
                .filter(p -> p.getType().equals("Book") && p.getPrice() > 250)
                .toList();
    }

    public static List<Product> applyDiscountForBooks(List<Product> products){
        return products.stream()
                .filter(p -> p.getType().equals("Book") && p.isDiscountApplicable())
                .peek(p -> p.setPrice((int) (p.getPrice() * 0.9)))
                .toList();
    }

    public static Product findTheCheapestBook(List<Product> products){
        return products.stream()
                .filter(p -> p.getType().equals("Book"))
                .min(Comparator.comparingInt(Product::getPrice))
                .orElseThrow(() -> new NoSuchElementException("There are no products with type \"Book\"!"));
    }

    public static List<Product> findThreeLastProducts(List<Product> products){
        return products.stream()
                .sorted(Comparator.comparing(Product::getAddDate).reversed())
                .limit(3)
                .toList();
    }

    public static int calculateGeneralPrice(List<Product> products){
        return products.stream()
                .filter(p -> p.getAddDate().getYear() == 2024)
                .filter(p -> p.getType().equals("Book") && p.getPrice() <= 75)
                .mapToInt(Product::getPrice)
                .sum();
    }

    public static Map<String, List<Product>> groupByType(List<Product> products){
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}
