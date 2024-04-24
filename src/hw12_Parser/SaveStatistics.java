package hw12_Parser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;
import java.util.Set;


public class SaveStatistics {
    public static File createStatisticsFile(String bookName){
        Path path = Path.of(BookReader.DIRECTORY_PATH + "/" + bookName + "_statistics.txt");
        return new File(path.toUri());
    }

    public static void writeStatistics(Map<String, Integer> map, Set<String> set, File file){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){

            for(Map.Entry<String, Integer> entry: map.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }

            writer.write("Overall amount of words: " + set.size());

        } catch (IOException e) {
            System.err.println("It's impossible to write into a file!");
        }
    }

}
