package com.ust.book_service.repository;

import com.ust.book_service.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import java.lang.classfile.constantpool.IntegerEntry;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
