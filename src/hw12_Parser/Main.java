package hw12_Parser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello! Enter the file name: ");
        String bookName = sc.nextLine();
        BookReader.getBookContent(bookName);
    }
}
