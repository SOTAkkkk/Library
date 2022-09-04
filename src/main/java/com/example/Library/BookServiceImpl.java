package com.example.Library;

import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookList findAll() {
        return bookRepository.getAll();
    }

    @Override
    public void addBok(Book book) {

    }
}
