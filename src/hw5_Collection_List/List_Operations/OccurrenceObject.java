package hw5_Collection_List.List_Operations;

public class OccurrenceObject{
    private final String name;
    private int occurrence;

    public OccurrenceObject(String name) {
        this.name = name;
        this.occurrence = 1;
    }

    public void incrementOccurrence(){
        occurrence++;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{name: \"" + name + "\", occurrence: " + occurrence + "}";
    }
}
