package hw12_Parser;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookReader{
    public static final Path DIRECTORY_PATH = Path.of("src/hw12_Parser");

    public static void getBookContent(String bookName){
        Path path = Path.of( DIRECTORY_PATH + "/" + bookName + ".txt");

        try(BufferedReader reader = new BufferedReader(
                new FileReader(path.toFile()))){
            StringBuilder content = new StringBuilder();
            String line;
            while((line = reader.readLine()) != null)
                content.append(line);

            String bookContent = content.toString().toLowerCase();
            splitBookToWords(bookContent, bookName);
        }
        catch (FileNotFoundException e){
            System.err.println("File does not exist!");
        }
        catch (IOException e) {
            System.out.println("rbhdrtbh");
        }
    }

    private static void splitBookToWords(String bookContent, String bookName){

        Pattern pt = Pattern.compile("[A-zА-я]{3,}");
        Matcher matcher = pt.matcher(bookContent);
        List<String> list = new ArrayList<>();
        while(matcher.find())
            list.add(matcher.group());

        Map<String, Integer> map = AnalyzeBook.findPopularWords(list);
        Set<String> set = AnalyzeBook.countUniqueWords(list);
        File file = SaveStatistics.createStatisticsFile(bookName);
        SaveStatistics.writeStatistics(map, set, file);
    }


}
