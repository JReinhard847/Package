package org.example;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Library(ArrayList<Book> books) {
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

    public void addBook(Book b) {
        books.add(b);
    }

    public void removeBook(Book b){
        books.remove(b);
    }
}
