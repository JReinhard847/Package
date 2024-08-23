package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book[] books = {new Book("abc", "def", "ghj"), new Book("xzy", "qwe", "jkl")};
        ArrayList<Book> bookList = new ArrayList<>(List.of(books));
        Library lib = new Library(bookList);
        System.out.println(lib);
    }
}