package ru.netology;

public class MovieManager {

    private String[] movies = new String[0];  // изначально у нас в массиве 0 ячеек и добавить мы туда ничего не можем
    private int limit;

    public MovieManager() {
        this.limit = 10;
    }

    public MovieManager(int limit) {
        this.limit = limit;

    }

    public void add(String movie) {     //поэтому в методе add  создаем временный массив tmp с длинной на одну ячейку больше чем в массиве movies
        String[] tmp = new String[movies.length + 1];    //вот он временный массив, его длина равна 1, так как мы к 0 прибавили 1( movies = 0)
        for (int i = 0; i < movies.length; i++) {     //это цикл. В массивах ячейки нумеруются с 0, поэтому первая ячейка имеет порядк.номер 0
            tmp[i] = movies[i];   //цикл работает пока i<длины массива movies(0). То есть цикл на первом витке останавливается и мы из него выходим.
        }
        tmp[tmp.length - 1] = movie; // присваиваем ячейке массива tmp определенный фильм movie
        movies = tmp;  // присваиваем массиву movies значение массива tmp
    }

    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}



