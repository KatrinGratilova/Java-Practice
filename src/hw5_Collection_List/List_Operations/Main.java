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
        System.out.println("Unique numbers: " + uniqueNumbers + "\n");

        // Calculate how many times each word occurs, output the result to the console
        calcOccurrence(animals);
        System.out.println();

        // Calculate how many times each word occurs, return the result as a list of structures
        System.out.println(findOccurrence(animals));
    }

    public static void countOccurrence(List<String> words, String word){
        int counter = 0;
        for (String currentWord: words){
            if (currentWord.equals(word))
                counter++;
        }
        System.out.println("The word \"" + word + "\" occurs " + counter + " times.\n");
    }

    public static <T> List<T> toList(T[] array){
        List<T> listFromArray = new ArrayList<>(Arrays.asList(array));
        return listFromArray;

        // OR we can do it without using existing method "Arrays.asList()"
/*        List<T> listFromArray = new ArrayList<>();
        for (T element: array){
            listFromArray.add(element);
        }
        return listFromArray;*/
    }

    public static List<Integer> findUnique(List<Integer> numbers){
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Integer number: numbers){
            if (!uniqueNumbers.contains(number))
                uniqueNumbers.add(number);
        }
        return uniqueNumbers;
    }

    public static void calcOccurrence(List<String> words) {
        List<String> occurrences = new ArrayList<>();
        for (String leftWord : words) {
            if (!occurrences.contains(leftWord)) {
                occurrences.add(leftWord);
                int counter = 0;
                for (String rightWord : words) {
                    if (leftWord.equals(rightWord))
                        counter++;
                }
                System.out.println(leftWord + ": occurs " + counter + " times.");
            }
        }
    }

    public static List<OccurrenceObject> findOccurrence(List<String> words){
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