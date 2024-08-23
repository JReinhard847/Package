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
        if(books.add(b)){
            System.out.println("Added " + b.toString() + " to library.");
        }
        else {
            System.out.println("Failed to add " + b.toString() + " to library.");
        }
    }

    public void removeBook(Book b){
        if(books.remove(b)){
            System.out.println("Removed " + b.toString() + " to library.");
        }
        else {
            System.out.println("Failed to remove " + b.toString() + " to library.");
        }

    }
}
