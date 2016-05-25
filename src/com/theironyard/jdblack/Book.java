package com.theironyard.jdblack;

/**
 * Created by jonathandavidblack on 5/25/16.
 */
public class Book {
    String title;
    String author;
    String genre;
    int numberOfPages;
    int yearWritten;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getYearWritten() {
        return yearWritten;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", yearWritten=" + yearWritten +
                '}';
    }

    //    public Book(String title, String author, String genre, int numberOfPages, int yearWritten){
//        this.title = title;
//        this.author = author;
//        this.genre = genre;
//        this.numberOfPages = numberOfPages;
//        this.yearWritten = yearWritten;
}


