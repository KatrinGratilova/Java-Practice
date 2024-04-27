package hw12_Parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to \"Book Analyzer\"!\nPlease enter the book name you want to be analyzed: ");
        String bookName = sc.nextLine();
        analyzeBook(bookName);
    }

    private static void analyzeBook(String bookName){
        // Methods for reading the book content and splitting the content to words
        String bookContent = " ";
        try {
            bookContent = BookReader.getBookContent(bookName);
        }
        catch (FileNotFoundException e){
            System.out.println("Sorry, there is no book with this title!");
            System.exit(1);
        }
        catch (IOException e) {
            System.err.println("An I/O error occurred, it's impossible to read the file!");
            System.exit(1);
        }

        List<String> allWords =  BookReader.splitBookToWords(bookContent);

        // Methods for getting the number each word occurs and overall amount of words (excluding repeating)
        Map<String, Integer> wordCounts = WordAnalyzer.findWordCounts(allWords);
        Set<String> uniqueWords = WordAnalyzer.findUniqueWords(allWords);

        // Methods to write statistics in file and to read it from file
        File statisticsFile = CreateStatistics.writeStatistics(bookName, wordCounts, uniqueWords);
        CreateStatistics.readStatisticsFile(statisticsFile);
    }
}
