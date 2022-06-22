package com.curso.gerenciadorlivros.controller;

import com.curso.gerenciadorlivros.dto.MessageResponseDTO;
import com.curso.gerenciadorlivros.entity.Book;
import com.curso.gerenciadorlivros.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create (@RequestBody Book book){
        return bookService.create(book);
    }
}
