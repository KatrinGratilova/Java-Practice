package hw12_Parser;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class BookReader{
    private static final Path DIRECTORY_PATH = Path.of("src/hw12_Parser/books"); // path to root package

    // Method for reading the file and getting its content
    public static String getBookContent(String bookName){
        Path path = Path.of( DIRECTORY_PATH + "/" + bookName + ".txt");
        String bookContent = " ";

        try(BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))){
            StringBuilder content = new StringBuilder();
            String line;
            while((line = reader.readLine()) != null)
                content.append(line);

            bookContent = content.toString().toLowerCase();
        }
        catch (FileNotFoundException e){
            System.err.println("File does not exist!");
            System.exit(1);
        }
        catch (IOException e) {
            System.err.println("An I/O error occurred, it's impossible to read the file!");
            System.exit(1);
        }
        return bookContent;
    }

    // Method for splitting book content to words
    public static List<String> splitBookToWords(String bookContent){
        List<String> list = new ArrayList<>(Arrays.asList(bookContent.split("[^A-zА-я']")));
        list.removeIf(a -> a.length() < 3);

        return list;
    }
}
