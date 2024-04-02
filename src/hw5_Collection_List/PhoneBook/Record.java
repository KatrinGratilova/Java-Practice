package hw5_Collection_List.PhoneBook;

public class Record {
    private final String name;
    private final String phoneNumber;

    public Record(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\t" + name + "  |  " + phoneNumber;
    }
}
