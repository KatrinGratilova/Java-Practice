package hw12_Parser;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class CreateStatistics {
    private static final Path DIRECTORY_PATH = Path.of("src/hw12_Parser/statistics");

    // Method for creating statistics file and writing in it
    public static File writeStatistics(String bookName, Map<String, Integer> map, Set<String> set){
        Path path = Path.of(DIRECTORY_PATH + "/" + bookName + "_statistics.txt");
        File staticticsFile = path.toFile();

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(staticticsFile))){
            map = map.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(11)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue, HashMap::new));

            writer.write(" \t\tTop 10 words\n");
            for(Map.Entry<String, Integer> entry: map.entrySet()) {
                writer.write(entry.getKey() + " - " + entry.getValue() + " times\n");
            }
            writer.write("\nOverall amount of unique words: " + set.size());

        }
        catch (IOException e) {
            System.err.println("It's impossible to write into a file!");
        }
        return staticticsFile;
    }

    // Method for reading from statistics file
    public static void readStatisticsFile(File file){
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = reader.readLine()) != null)
                System.out.println(line);
        }
        catch (FileNotFoundException e){
            System.err.println("File does not exist!");
        }
        catch (IOException e) {
            System.err.println("An I/O error occurred, it's impossible to read the file!");
        }
    }
}
