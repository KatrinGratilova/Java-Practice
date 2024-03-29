package hw5_Collection_List.List_Operations;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(List.of("bird", "cat", "dog", "bird", "fox", "cat", "bird",
                                                     "bird", "dog", "cat", "bird", "dog", "cat", "fox", "bird"));
        // Count how many times the given string occurs
        countOccurrence(animals, "fox");

        Character[] letters = {'v', 'a', 'l', 'l', 'e', 'y'};
        // Convert the array to a list of the appropriate data type and return it from the method
        List<Character> lettersList = toList(letters);
        System.out.println(Arrays.toString(letters) + " (class: " + letters.getClass() + ")");
        System.out.println(lettersList + " (class: " + lettersList.getClass() + ")\n");

        List<Integer> numbers = new ArrayList<>(List.of(2, 4, 34, -12, 0, 2, 23, 23));
        // Return a new numeric list containing only unique numbers
        List<Integer> uniqueNumbers = findUnique(numbers);
        System.out.println("All numbers: " + numbers);
        System.out.println("Unique numbers: " + uniqueNumbers);

        List<String> animalsCopy = new ArrayList<>(animals);

        // Calculate how many times each word occurs, output the result to the console
        calcOccurrence(animals);

        // Calculate how many times each word occurs, return the result as a list of structures
        System.out.println(findOccurrence(animalsCopy));
    }

    public static void countOccurrence(List<String> words, String word){
        int counter = 0;
        for (String currentWord: words){
            if (currentWord.equals(word)) counter++;
        }
        System.out.println("The word \"" + word + "\" occurs " + counter + " times.\n");
    }

    public static <T> List<T> toList(T[] array){
            List<T> listFromArray = new ArrayList<>(Arrays.asList(array));
        return listFromArray;
    }

    public static List<Integer> findUnique(List<Integer> numbers){
        List<Integer> uniqueNumbers = new ArrayList<>(numbers);
        for (int i = 0; i < uniqueNumbers.size() - 1; i++){
            for (int j = i + 1; j < uniqueNumbers.size(); j++) {
                if (uniqueNumbers.get(i).equals(uniqueNumbers.get(j))) {
                    uniqueNumbers.remove(j);
                }
            }
        }
        return uniqueNumbers;
    }

    public static void calcOccurrence(List<String> words) {
        System.out.println();
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            int counter = 1;
            for (int j = i + 1; j < words.size(); j++) {
                if (word.equals(words.get(j))) {
                    counter++;
                    words.remove(j);
                    j--;
                }
            }
            System.out.println(word + ": occurs " + counter + " times.");
        }
    }

    public static List<OccurrenceObject> findOccurrence(List<String> words){
        System.out.println();
        List<OccurrenceObject> occurrences = new ArrayList<>();
        for (String word: words){
            boolean inList = false;
            for (OccurrenceObject object: occurrences){
                if (word.equals(object.getName())){
                    inList = true;
                    object.incrementOccurrence();
                }
            }
            if (!inList){
                occurrences.add(new OccurrenceObject(word));
            }
        }
        return occurrences;
    }
}



