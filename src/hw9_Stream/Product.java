package hw9_Stream;

import java.time.LocalDate;

public class Product{
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

    public static ProductBuilder builder(String type, int price){
        return new ProductBuilder(type, price);
    }

    static public class ProductBuilder{
        private int id;
        private String type;
        private int price;
        private boolean isDiscountApplicable;
        private LocalDate addDate;

        public ProductBuilder(String type, int price) {
            this.type = type;
            this.price = price;
        }

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
            return new Product(id, type, price, isDiscountApplicable, addDate);
        }
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

    public String toString() {
        return "\t{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", isDiscountApplicable=" + isDiscountApplicable +
                ", addDate=" + addDate +
                '}';
    }
}
