package com.theironyard.jdblack;
import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Main {

    static final String SAVE_FILE = "book.json";
    static Scanner scanner = new Scanner(System.in);
    static Book book;
    public static void main(String[] args) throws IOException {

        Book book = loadBook(SAVE_FILE);
        if (book != null){
            System.out.println(book.toString());
        }
        else{
            book = new Book();
        }
        System.out.println("Welcome to BookWorm.Com");
        System.out.println(" ");
        System.out.println("We'd like to compile information on your favorite book.");
        System.out.println(" ");
        System.out.println("We'll ask you a series of 5 questions about the book:");
        System.out.println(" ");


        book = new Book();
        System.out.println("What is the title of the book?");
        String option1 = scanner.nextLine();
        book.title = option1;
        System.out.println("What is the author's name?");
        String option2 = scanner.nextLine();
        book.author = option2;
        System.out.println("What is the genre of the book?");
        String option3 = scanner.nextLine();
        book.genre = option3;
        System.out.println("How many pages does the book contain?");
        String option4 = scanner.nextLine();
        int intNumOfPages = Integer.valueOf(option4);
        book.numberOfPages = intNumOfPages;
        System.out.println("In what year was the book written?");
        String option5 = scanner.nextLine();
        int intYearWritten = Integer.valueOf(option5);
        book.yearWritten = intYearWritten;
        System.out.println("Thank you for completing the survey.");
        saveBook(book, SAVE_FILE);
    }
    public static Book loadBook(String SAVE_FILE){
        File f = new File(SAVE_FILE);
        try {
            Scanner scanner = new Scanner(f);
            scanner.useDelimiter("\\Z");
            String contents = scanner.next();
            JsonParser parser = new JsonParser();
            return parser.parse(contents, Book.class);
        } catch (FileNotFoundException e) {
            System.out.println("Failure to Load");
        }

        return null;
    }

    public static void saveBook(Book book, String SAVE_FILE){
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.include("*").serialize(book);

        File f = new File(SAVE_FILE);

        try {
            FileWriter fw = new FileWriter(f);
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
