package hw12_Parser;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class BookReader{
    private static final Path DIRECTORY_PATH = Path.of("src/hw12_Parser/books"); // path to root package

    // Method for reading the file and getting its content
    public static String getBookContent(String bookName) throws IOException {
        Path path = Path.of( DIRECTORY_PATH + "/" + bookName + ".txt");

        BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));
        StringBuilder content = new StringBuilder();
        String line;

        while((line = reader.readLine()) != null)
            content.append(line);

        String bookContent = content.toString().toLowerCase();
        reader.close();

        return bookContent;
    }

    // Method for splitting book content to words
    public static List<String> splitBookToWords(String bookContent){
        List<String> bookWords = new ArrayList<>(Arrays.asList(bookContent.split("[^A-zА-я']")));
        bookWords.removeIf(word -> word.length() < 3);

        return bookWords;
    }
}
