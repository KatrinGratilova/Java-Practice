package hw12_Parser;

import java.util.*;

public class WordAnalyzer {
    // Returns a map, containing the word and the number of occurrences of it
    public static Map<String, Integer> findWordCounts(List<String> list){
        Map<String, Integer> wordCounts = new HashMap<>();
        for(String word: list)
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);

        return wordCounts;
    }

    // Returns unique words
    public static Set<String> findUniqueWords(List<String> list){
        Set<String> words = new HashSet<>(list);
        return words;
    }
}
