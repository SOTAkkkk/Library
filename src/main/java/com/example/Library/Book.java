package com.example.Library;

public class Book {
    private int bookId;
    private String boookName;
    private int bookPages;

    public Book(int bookId, String boookName, int bookPages) {
        this.bookId = bookId;
        this.boookName = boookName;
        this.bookPages = bookPages;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBoookName() {
        return boookName;
    }

    public void setBoookName(String boookName) {
        this.boookName = boookName;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }
}
