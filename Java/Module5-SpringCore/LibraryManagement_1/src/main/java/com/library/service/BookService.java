package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {

        this.bookRepository = bookRepository;

        System.out.println("BookService Constructor Called");

    }

    public void display() {

        System.out.println("Repository Object : " + bookRepository);

    }

}