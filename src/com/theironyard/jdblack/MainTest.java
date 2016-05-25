package com.theironyard.jdblack;

import org.junit.Test;

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
    }
}

//}
//
//    //test methods need to be void and take 0 arguments
//    Player player = new Player();
//player.name = "Test Player";
//        player.weapon = "Test Weapon";
//        player.location = "Test Location";
//
//        Main.saveGame(player, TEST_FILE);
//        Player newPlayer = Main.loadGame(TEST_FILE);
//
//        File f = new File(TEST_FILE);
//        f.delete();
//
//        assertTrue(newPlayer != null);
//        assertTrue(newPlayer.name.equals(player.name));
//        assertTrue(newPlayer.weapon.equals(player.weapon));
//        assertTrue(newPlayer.location.equals(player.location));
//
//
//        }