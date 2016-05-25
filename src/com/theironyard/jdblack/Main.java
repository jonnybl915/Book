package com.theironyard.jdblack;
import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.util.HashMap;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to BookWorm.Com");
        System.out.println(" ");
        System.out.println("We'd like to compile information on your favorite book.");
        System.out.println(" ");
        System.out.println("We'll ask you a series of 5 questions, and then you'll be done!");
        //System.out.println("Do you wish to proceed? [Y/N]");
        //String option = scanner.nextLine();
        //if(option.equalsIgnoreCase("Y")) {
            //proceed to
        Book b1 = new Book();
        b1.title = "11.22.1963";
        b1.author = "Stephen King";
        b1.genre = "time traveling";
        b1.numberOfPages = 1111;
        b1.yearWritten = 1999;

        System.out.println("What is the title of the book?");
        String option1 = scanner.nextLine();
        System.out.println("What is the author's name?");
        String option2 = scanner.nextLine();
        System.out.println("What is the genre of the book?");
        String option3 = scanner.nextLine();
        System.out.println("How many pages does the book contain?");
        String option4 = scanner.nextLine();
        System.out.println("In what year was the book written?");
        String option5 = scanner.nextLine();

        File f = new File("book.json");



//        //write json
//        JsonSerializer serializer = new JsonSerializer();
//        String json = serializer.serialize(person2);
//        FileWriter fw = new FileWriter(f);
//        fw.write(json);
//        fw.close();
//
//        //read json
//        Scanner scanner = new Scanner(f);
//        scanner.useDelimiter("\\Z");
//        String contents = scanner.next();
//        JsonParser parser = new JsonParser();
//        // HashMap person3 = parser.parse(contents);
//        Person person3 = parser.parse(contents, Person.class);
//        System.out.println(person3);


    }



}
