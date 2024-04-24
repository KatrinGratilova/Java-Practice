package hw12_Parser;

import java.util.*;

public class AnalyzeBook {
    public static Map<String, Integer> findPopularWords(List<String> list){
        Map<String, Integer> map = new TreeMap<>();
        for(String word: list){
            if (!map.containsKey(word)){
                map.put(word, 1);
            }
            else{
                int count = map.get(word);
                map.replace(word, ++count);
            }
        }

        return map;
    }

    public static Set<String> countUniqueWords(List<String> list){
        Set<String> set = new HashSet<>(list);
        return set;
    }
}
