package com.example.Library;

public class Book {
    private int bookId;
    private String bookName;
    private int bookPages;

    public Book(int bookId, String bookName, int bookPages) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPages = bookPages;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String boookName) {
        this.bookName = boookName;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }
}
