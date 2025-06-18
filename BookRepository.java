package com.example.mvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mvc.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
