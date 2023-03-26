package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void Test3() {       // добавляю 3 фильма
        MovieManager manager = new MovieManager();


        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");


        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Test1() {          // добавляю 1 фильм
        MovieManager manager = new MovieManager();

        manager.add("Movie 1");

        String[] expected = {"Movie 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Test0() {          // не добавляю ничего
        MovieManager manager = new MovieManager();

        manager.add("Movie 0");

        String[] expected = {"Movie 0"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void Test9() {          // последние 9 фильмов
        MovieManager manager = new MovieManager(9);

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");
        manager.add("Movie 9");


        String[] expected = {"Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void Test10() {         // последние 10 фильмов
        MovieManager manager = new MovieManager(10);

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");
        manager.add("Movie 9");
        manager.add("Movie 10");

        String[] expected = {"Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void Test11() {                // последние 11 фильмов
        MovieManager manager = new MovieManager(11);

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");
        manager.add("Movie 9");
        manager.add("Movie 10");

        String[] expected = {"Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void Test5() {                  // последние 5 фильмов
        MovieManager manager = new MovieManager(5);

        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");
        manager.add("Movie 9");
        manager.add("Movie 10");

        String[] expected = {"Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void Test7() {                // первые добавленные 7 фильмов
        MovieManager manager = new MovieManager(7);

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");


        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestLast() {                  // последние 1 фильм
        MovieManager manager = new MovieManager(1);

        manager.add("Movie 10");

        String[] expected = {"Movie 10"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

















