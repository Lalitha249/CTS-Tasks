package com.library.service;

import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;
@Service
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