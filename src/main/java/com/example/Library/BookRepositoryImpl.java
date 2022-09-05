package com.example.Library;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository{
    private BookList bookList;

    public BookRepositoryImpl(){
        List<Book> books = Collections.synchronizedList(new ArrayList<Book>());
        books.add(new Book(1,"Java",332));
        books.add(new Book(2,"SpringBoot",22));
        books.add(new Book(3,"MySQL",123));
        bookList = new BookList();
        bookList.setBooks(books);
    }


    @Override
    public BookList getAll() {
        return bookList;
    }

    @Override
    public void add(Book book) {
        int currentMaxId = bookList.getBooks()
                .stream()
                .map(b -> b.getBookId())
                .max(Comparator.naturalOrder())
                .orElse(0);
        book.setBookId(currentMaxId+1);
        bookList.getBooks().add(book);
    }
}
