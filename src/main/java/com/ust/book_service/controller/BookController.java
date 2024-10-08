package com.ust.book_service.controller;

import com.ust.book_service.entity.Book;
import com.ust.book_service.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookRepository bookRepo;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }

    @GetMapping("/books/{bid}")
    public Book getABook(@PathVariable("bid") int bid){
        return bookRepo.findById(bid).orElse(null);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        return bookRepo.saveAndFlush(book);
    }
}
