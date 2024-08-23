package org.example;

public class Main {
    public static void main(String[] args) {
        Book[] books = {new Book("abc","def","ghj"),new Book("xzy","qwe","jkl")};
        Library lib = new Library(books);
        System.out.println(lib);
    }
}