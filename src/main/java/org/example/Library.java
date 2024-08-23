package org.example;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Library(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        String booksList = "";
        for (Book book : books) {
            booksList += "       " + book.toString() + "\n";
        }
        return "Library with books: \n" + booksList;

    }
}
