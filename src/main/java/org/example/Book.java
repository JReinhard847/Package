package org.example;

public class Book {
    private String title, author, isbn;

    public String getAuthor() {
        return author;
    }

    public Book(String author, String isbn, String title) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }

    @Override
    public String toString() {
        return title + " by " + author + ", ISBN: " + isbn;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
