package com.example.Library;

import org.springframework.stereotype.Service;

public interface BookService {
    BookList findAll();
    void addBok(Book book);
}
