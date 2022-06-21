package com.curso.gerenciadorlivros.repository;

import com.curso.gerenciadorlivros.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
