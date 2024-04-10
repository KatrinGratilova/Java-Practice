package hw9_Stream;

import java.time.LocalDate;

public class Product implements Comparable<Product>{
    private final int id;
    private final String type;
    private int price;
    private final boolean isDiscountApplicable;
    private final LocalDate addDate;

    private Product(int id, String type, int price, boolean isDiscountApplicable, LocalDate addDate) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.isDiscountApplicable = isDiscountApplicable;
        this.addDate = addDate;
    }

    public static ProductBuilder builder(){
        return new ProductBuilder();
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isDiscountApplicable() {
        return isDiscountApplicable;
    }

    public LocalDate getAddDate() {
        return addDate;
    }

    static public class ProductBuilder{
        private int id;
        private String type;
        private int price;
        private boolean isDiscountApplicable;
        private LocalDate addDate;


        public ProductBuilder id(int id){
            this.id = id;
            return this;
        }

        public ProductBuilder type(String  type){
            this.type = type;
            return this;
        }

        public ProductBuilder price(int price){
            this.price = price;
            return this;
        }

        public ProductBuilder isDiscountApplicable(boolean isDiscountApplicable){
            this.isDiscountApplicable = isDiscountApplicable;
            return this;
        }

        public ProductBuilder addDate(LocalDate addDate){
            this.addDate = addDate;
            return this;
        }

        public Product build(){
            if (validateProduct()) return new Product(id, type, price, isDiscountApplicable, addDate);
            System.out.println("Product object can't be built without type and price!");
            return null;
        }

        private boolean validateProduct(){
            return type != null && price != 0;
        }
    }

    public String toString() {
        return "\t{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", isDiscountApplicable=" + isDiscountApplicable +
                ", addDate=" + addDate +
                '}';
    }

    public void printTypePrice() {
        System.out.println("\ttype='" + type + "', price=" + price);
    }

    public void printTypePriceDiscount() {
        System.out.println("\ttype='" + type + "', price=" + price + ", isDiscountApplicable=" + isDiscountApplicable);
    }

    public void printTypePriceDiscountDate() {
        System.out.println("\ttype='" + type + "', price=" + price + ", isDiscountApplicable="
                + isDiscountApplicable + ", addDate=" + addDate);
    }

    @Override
    public int compareTo(Product o) {
        return o.addDate.compareTo(addDate);
    }
}
