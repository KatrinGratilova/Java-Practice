package hw5_Collection_List.PhoneBook;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook odessaPhoneBook = new PhoneBook();
        odessaPhoneBook.add(new Record("Gratilova Katrin", "+380632546866"));
        odessaPhoneBook.add(new Record("Marilyn Manson", "+380982058711"));
        odessaPhoneBook.add(new Record("Gratilova Katrin", "+380973688366"));
        odessaPhoneBook.add(new Record("Madison Montgomery", "+38089652008"));
        odessaPhoneBook.add(new Record("Marilyn Manson", "+38089652008"));
        odessaPhoneBook.add(new Record("Evan Peters", "+38089652008"));
        odessaPhoneBook.add(new Record("Kody Fern", "+38089652008"));
        odessaPhoneBook.add(new Record("Gratilova Katrin", "+380948202934"));

        String searchingName = "Marilyn Manson";

        Record foundRecord = odessaPhoneBook.find(searchingName);
        if (foundRecord != null)
            System.out.println("Record found by name " + searchingName + " (only first):\n" + foundRecord + "\n");
        else
            System.out.println("There are no records for name " + searchingName + ".\n");

        searchingName = "Madison O";
        foundRecord = odessaPhoneBook.find(searchingName);
        if (foundRecord != null)
            System.out.println("Record found by name " + searchingName + " (only first):\n" + foundRecord + "\n");
        else
            System.out.println("There are no records for name " + searchingName + ".\n");

        searchingName = "Gratilova Katrin";
        List<Record> foundRecords = odessaPhoneBook.findAll(searchingName);
        if (!foundRecords.isEmpty()) {
            System.out.println("Records found by name " + searchingName + " (all): ");
            for (Record currentRecord : foundRecords)
                System.out.println(currentRecord);
        }
        else
            System.out.println("There are no records for name " + searchingName + ".\n");
    }
}