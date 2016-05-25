package com.theironyard.jdblack;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by jonathandavidblack on 5/25/16.
 */
public class MainTest {
    static final String TEST_FILE = "test.json";
    @Test
    public void saveAndLoadBook() throws Exception {
        Book book = new Book();
        book.title = "Test Title";
        book.author = "Test Author";
        book.genre  = "Test Genre";
        book.yearWritten = 11111;
        book.numberOfPages = 222222;

        Main.saveBook(book, TEST_FILE);
        Book newBook = Main.loadBook(TEST_FILE);

        File f = new File(TEST_FILE);
        f.delete();

        assertTrue(newBook != null);
        assertTrue(newBook.title.equals(book.title));
        assertTrue(newBook.author.equals(book.author));
        assertTrue(newBook.genre.equals(book.genre));
        assertTrue(newBook.numberOfPages == book.numberOfPages);
        assertTrue(newBook.yearWritten == book.yearWritten);
    }
}