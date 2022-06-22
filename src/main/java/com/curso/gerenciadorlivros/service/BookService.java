package com.curso.gerenciadorlivros.service;

import com.curso.gerenciadorlivros.dto.MessageResponseDTO;
import com.curso.gerenciadorlivros.entity.Book;
import com.curso.gerenciadorlivros.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public MessageResponseDTO create (Book book){
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book created with ID: "+savedBook.getId())
                .build();
    }
}
