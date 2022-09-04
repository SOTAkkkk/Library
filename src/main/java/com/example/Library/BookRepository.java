package com.example.Library;

public interface BookRepository {
    BookList getAll();
    void add(Book book);
}
