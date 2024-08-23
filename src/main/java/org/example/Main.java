package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book[] books = {new Book("Stephen King", "0-670-81302-8", "IT"), new Book("Virginia Woolf", "978-3-15-020640-9", "A Room Of One's Own")};
        ArrayList<Book> bookList = new ArrayList<>(List.of(books));
        Library lib = new Library(bookList);
        System.out.println(lib);

        Book testBook = new Book("Bram Stoker", "978-3-15-020352-1", "Dracula");
        lib.addBook(testBook);
        lib.removeBook(testBook);


    }
}